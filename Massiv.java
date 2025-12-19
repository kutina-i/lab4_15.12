import java.util.Comparator;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Arrays;


public class Massiv {

    public Massiv(){
    }
    public void Task1(int[] arr, int n) {
        boolean isIncreasing = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i-1]) {
                isIncreasing = false;
                break;
            }
        }
        System.out.println("Является ли возрастающей последовательностью: " + isIncreasing);
    }

        public void Task2(int[] arr, int n) {
            int maxLength = 1;
            int currentLength = 1;
            int startIndex = 0;
            int maxStart = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] > arr[i-1]) {
                    currentLength++;
                } else {
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        maxStart = startIndex;
                    }
                    currentLength = 1;
                    startIndex = i;
                }
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxStart = startIndex;
            }
            System.out.println("Длина максимальной возрастающей подпоследовательности: " + maxLength);
            System.out.print("Подпоследовательность: ");
            for (int i = maxStart; i < maxStart + maxLength; i++) {
                System.out.print(arr[i] + " ");
            }
    }

        public void Task3(int[] arr, int n) {
            int maxLength = 1;
            int start = 0;
            for (int i = 0; i < n; i++) {
                int left = i, right = i;
                while (left >= 0 && right < n && arr[left] == arr[right]) {
                    if (right - left + 1 > maxLength) {
                        maxLength = right - left + 1;
                        start = left;
                    }
                    left--;
                    right++;
                }

                left = i;
                right = i + 1;
                while (left >= 0 && right < n && arr[left] == arr[right]) {
                    if (right - left + 1 > maxLength) {
                        maxLength = right - left + 1;
                        start = left;
                    }
                    left--;
                    right++;
                }
            }

            System.out.println("Длина максимальной симметричной подпоследовательности: " + maxLength);
            System.out.print("Подпоследовательность: ");
            for (int i = start; i < start + maxLength; i++) {
                System.out.print(arr[i] + " ");
            }
    }

        public void Task4(int[] arr, int n) {
            int[] dp = new int[n];
            int maxLength = 0;
            for (int i = 0; i < n; i++) {
                dp[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (arr[i] > arr[j] && dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                    }
                }
                maxLength = Math.max(maxLength, dp[i]);
            }

            System.out.println("Длина максимальной возрастающей подпоследовательности: " + maxLength);
    }

        public void Task5(int[] arr) {
            HashMap<Integer, Integer> frequency = new HashMap<>();
            for (int num : arr) {
                frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            }

            int count = 0;
            for (int freq : frequency.values()) {
                if (freq == 1) {
                    count++;
                }
            }

            System.out.println("Количество элементов, встречающихся один раз: " + count);
    }

        public void Task6(int[] arr) {

            HashMap<Integer, Integer> frequency = new HashMap<>();

            for (int num : arr) {
                frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            }

            int maxCount = 0;
            int mostFrequent = arr[0];

            for (HashMap.Entry<Integer, Integer> entry : frequency.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostFrequent = entry.getKey();
                }
            }

            System.out.println("Элемент, встречающийся максимальное число раз: " + mostFrequent);
            System.out.println("Количество вхождений: " + maxCount);
        }

        public void Task7(int[] arr) {
            HashSet<Integer> uniqueElements = new HashSet<>();

            for (int num : arr) {
                uniqueElements.add(num);
            }

            System.out.println("Количество различных элементов: " + uniqueElements.size());
        }

        public void Task8(double[] arr, int n) {
            Integer[] indices = new Integer[n];
            for (int i = 0; i < n; i++) {
                indices[i] = i;
            }
            Arrays.sort(indices, Comparator.comparingDouble(a -> arr[a]));

            System.out.println("\nКоманда из 4 лучших спортсменов:");
            for (int i = 0; i < Math.min(4, n); i++) {
                int index = indices[i];
                System.out.println("Спортсмен №" + (index + 1) + ": " + arr[index] + " сек");
            }
        }

        public void Task9(int[] arr1, int[] arr2) {
            HashSet<Integer> set2 = new HashSet<>();
            for (int num : arr2) {
                set2.add(num);
            }
            int commonCount = 0;
            for (int num : arr1) {
                if (set2.contains(num)) {
                    commonCount++;
                }
            }
            System.out.println("Количество элементов первого массива, содержащихся во втором: " + commonCount);
    }

        public void Task10(int[] arr) {

            HashSet<Integer> uniqueElements = new HashSet<>();
            boolean isSet = true;

            for (int num : arr) {
                if (!uniqueElements.add(num)) {
                    isSet = false;
                    break;
                }
            }
            System.out.println("Образует ли массив множество: " + isSet);
    }

        public void Task11 (int[] arr1, int n1, int[] arr2, int n2) {
            HashSet<Integer> set1 = new HashSet<>();
            for (int i = 0; i < n1; i++) {
                set1.add(arr1[i]);
            }
            HashSet<Integer> set2 = new HashSet<>();
            for (int i = 0; i < n2; i++) {
                set2.add(arr2[i]);
            }
            boolean areEqual = set1.equals(set2);
            System.out.println("Равны ли множества: " + areEqual);
        }

}
