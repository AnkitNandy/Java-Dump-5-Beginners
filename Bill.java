/**Define a class Bill that calculates the telephone bill of a 
 * consumer with the following description:
 * 
 * Instance Variables/Data Members:-
 * int bno - bill number
 * String name - name of consumer
 * int call - no. of calls consumed in a month
 * double amt - bill amount to be paid by the person
 * 
 * Methods/Member functions:-
 * Bill() - constructor to initialize data members with
 *          default initial values.
 * Bill(......) - parameterized constructor to accept bill no., name
 *                and no. of calls consumed.
 * Calculate() - To calculate the monthly telephone bill for a 
 *               consumer as per the following condition.
 *               UNIT CONSUMED                   RATE
 *              First 100 calls              Rs. 0.60/call
 *               Next 100 calls              Rs. 0.80/call
 *               Next 100 calls              Rs. 1.20/call
 *              Above 300 calls              Rs. 1.50/call
 *              
 * Fixed Monthly Rental applicable to all consumers : Rs. 125.
 * 
 * Display() - To display the details.
 * Create an object in the main() method and invoke the above function
 * to perform the desired task.
 */