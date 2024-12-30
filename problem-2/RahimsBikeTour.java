import java.util.Scanner;

public class RahimsBikeTour {
    public void findPeaks() {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = scanner.nextInt();
            int[] heights = new int[N];

            for (int i = 0; i < N; i++) {
                heights[i] = scanner.nextInt();
            }

            int peakCount = 0;

            for (int i = 1; i < N - 1; i++) {
                if (heights[i] > heights[i - 1] && heights[i] > heights[i + 1]) {
                    peakCount++;
                }
            }

            System.out.println("Case #" + t + ": " + peakCount);
        }
    }

}
