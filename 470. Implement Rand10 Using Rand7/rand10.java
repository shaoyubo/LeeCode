/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() {
        int row;
        int col;
        int index;
        do {
            row = rand7();
            col = rand7();
            index = col + (row - 1) * 7;
        } while (index > 40);
        return (index - 1) % 10 + 1;
    }
}