// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum w

public class richestman {
    public static int[] richestMan(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        int richestPerson = -1;

        for (int person = 0; person < accounts.length; person++) {
            // Sum the bank accounts for each person
            int rowSum = 0;

            for (int account = 0; account < accounts[person].length; account++) {
                rowSum += accounts[person][account];
            }

            // Update maxWealth and richestPerson if a wealth greater than the current
            // maximum is found
            if (rowSum > maxWealth) {
                maxWealth = rowSum;
                richestPerson = person;
            }
        }

        return new int[] { maxWealth, richestPerson + 1 }; // +1 to convert to 1-based index
    }

    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 2, 3, 4 } };
        int[] result = richestMan(accounts);

        System.out.println("The wealth of the richest person is: " + result[0]);
        System.out.println("The richest person is person number: " + result[1]);
    }
}
