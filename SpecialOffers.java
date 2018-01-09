package com.esendex;

    public class SpecialOffers {

        int setA[] = new int[2];
        int setB[] = new int[2];
        int setC[] = new int[2];
        int setD[] = new int[2];

        public SpecialOffers(int A_amount, int A_offer, int B_amount, int B_offer, int C_amount, int C_offer, int D_amount, int D_offer) {
            System.out.println("Ready to scan.");
            setA[0] = A_amount;
            setA[1] = A_offer;

            setB[0] = B_amount;
            setB[1] = B_offer;

            setC[0] = C_amount;
            setC[1] = C_offer;

            setD[0] = D_amount;
            setD[1] = D_offer;
        }

        protected int[][] getPricing() {
            int pricingRules[][] = new int[][]{
                    this.getSetA(),
                    this.getSetB(),
                    this.getSetC(),
                    this.getSetD()
            };
            return pricingRules;
        }

        protected int[] getSetA() {
            return setA;
        }

        protected int[] getSetB() {
            return setB;
        }

        protected int[] getSetC() {
            return setC;
        }

        protected int[] getSetD() {
            return setD;
        }

    }


