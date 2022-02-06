package com.company;

public interface ATM {

    /** Verifies a user's PIN.
     * @param pin The user's PIN
     * @return Whether or not the User's PIN is verified
     * */
    boolean verifyPIN(String pin);

    /** Allows the user to select an account.
     * @return a String representing the account selected*/
    String selectAccount();

    /** Withdraws a specified amount of money
     * @param account The account from which the money comes
     * @param amount The amount of money withdrawn
     * @return Whether or not the operation is successful
     * */
    boolean withdraw(String account, double amount);

    /** Displays the result of a PIN verification
     * @param pin The user's pin
     * @param success Whether or not the PIN was valid*/
    void display(String pin, double amount, boolean success);

    /** Displays an account balance
     * @param account The account selected*/
    void showBalance(String account);
}
