package MayChallanges;

/**
 * Leetcode Challenge - May - Day1
 * <p>
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * You are given an API bool isBadVersion(version) which will return whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * <p>
 * Given n = 5, and version = 4 is the first bad version.
 * <p>
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * <p>
 * Then 4 is the first bad version.
 * <p>
 * /* The isBadVersion API is defined in the parent class VersionControl.
 * boolean isBadVersion(int version);
 */
public class FirstBadVersion {

    public static void main(String[] args) {

    }

    public static int firstBadVersion(int n) {

        int answer = n;

        int start = 1;
        int end = n;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (isBadVersion(mid) == true) {
                answer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return answer;
    }

    private static boolean isBadVersion(int mid) {
        return true; // just dummy.
    }
}
