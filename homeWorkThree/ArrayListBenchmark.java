    import java.util.ArrayList;
    import java.util.List;
    import java.util.Random;

    public class ArrayListBenchmark {
        /**
         * I generated a benchmark tester to show me the required information about the times of ArrayList and CSArrayList functions, I have included it here so you can replicate them, just in case
         */
        private static final int[] SIZES = {
                100_000, 250_000, 500_000, 1_000_000
        };

        public static void main(String[] args) {
            System.out.printf("%-10s %-20s %-20s%n",
                    "N", "CSArrayList (ms)", "ArrayList (ms)");
            System.out.println("Append:");

            for (int n : SIZES) {
                benchmarkAppend(n);
            }

            System.out.println("\nRandom get:");
            for (int n : SIZES) {
                benchmarkRandomGet(n);
            }
        }

        private static void benchmarkAppend(int n) {
            long start, end;

            CSArrayList<Integer> csList = new CSArrayList<>();
            start = System.nanoTime();
            for (int i = 0; i < n; i++) {
                csList.add(i);
            }
            end = System.nanoTime();
            long csTime = (end - start) / 1_000_000;

            List<Integer> javaList = new ArrayList<>();
            start = System.nanoTime();
            for (int i = 0; i < n; i++) {
                javaList.add(i);
            }
            end = System.nanoTime();
            long javaTime = (end - start) / 1_000_000;

            System.out.printf("%-10d %-20d %-20d%n",
                    n, csTime, javaTime);
        }

        private static void benchmarkRandomGet(int n) {
            Random rand = new Random(42);
            int ops = 100_000;

            CSArrayList<Integer> csList = new CSArrayList<>();
            ArrayList<Integer> javaList = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                csList.add(i);
                javaList.add(i);
            }

            long start = System.nanoTime();
            for (int i = 0; i < ops; i++) {
                csList.get(rand.nextInt(n));
            }
            long csTime = (System.nanoTime() - start) / 1_000_000;

            start = System.nanoTime();
            for (int i = 0; i < ops; i++) {
                javaList.get(rand.nextInt(n));
            }
            long javaTime = (System.nanoTime() - start) / 1_000_000;

            System.out.printf("%-10d %-20d %-20d%n",
                    n, csTime, javaTime);
        }
    }
