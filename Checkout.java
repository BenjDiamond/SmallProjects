public class Checkout {

    private int itemA = 60;
    private int itemB = 30;
    private int itemC = 30;
    private int itemD = 25;

    private int countA, counB, countC, countD, 
                A_SpecAmount, A_SpecTotal, B_SpecAmount, B_SpecTotal C_SpecAmount, C_SpecTotal, D_SpecAmount, D_SpecTotal,
                total;
  
    protected Checkout(int rules[][]) {

        A_SpecAmount = rules[0][0];
        A_SpecTotal = rules[0][1];

        B_SpecAmount = rules[1][0];
        B_SpecTotal = rules[1][1];

        C_SpecAmount = rules[2][0];
        C_SpecTotal = rules[2][1];

        D_SpecAmount = rules[3][0];
        D_SpecTotal = rules[3][1];
    }

    protected void scan(char item) {
        switch (item) {
            case 'A':
                countA++;
                if (countA == A_SpecAmount && A_SpecAmount != 0) {  //if there is an offer on
                    total += A_SpecTotal;                           //add the offer
                    total -= ((A_SpecAmount - 1) * itemA);          //minus the cost without the offer
                    countA = 0;                                     //reset the counter
                } else {
                    total += itemA;
                }
                break;
            case 'B':
                countB++;
                if (countB == B_SpecAmount && B_SpecAmount != 0) {
                    total += B_SpecTotal;
                    total -= ((B_SpecAmount - 1) * itemB);
                    countB = 0;
                } else {
                    total += itemB;
                }
                break;
            case 'C':
                countC++;
                if (countC == C_SpecAmount && C_SpecAmount != 0) {
                    total += C_SpecTotal;
                    total -= ((C_SpecAmount - 1) * itemC);
                    countC = 0;
                } else {
                    total += itemC;
                }
                break;
            case 'D':
                countD++;
                if (countD == D_SpecAmount && D_SpecAmount != 0) {
                    total += D_SpecTotal;
                    total -= ((D_SpecAmount - 1) * itemD);
                    countD = 0;
                } else {
                    total += itemD;
                }
                break;
            default:
                System.out.println("Item not recognised, please scan another.");
                break;
        }
    }

    protected int getTotal() {
        return total;
    }
}

