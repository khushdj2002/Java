package LeetrCode;

import java.util.Arrays;

public class BoothsAlgorithm {
    public static void main(String[] args) {
        int Q = 9;
        int M = -10;
        String a = Integer.toBinaryString(Q);

        String b = Integer.toBinaryString(M);
        char charr[] = new char[32];
        for (int i = 0; i < charr.length; i++) {
            charr[i] = b.charAt(i);
        }
        String c = Integer.toBinaryString(Math.abs(M));
        int count = c.length() + 1;
        char cha[] = new char[count];
        Arrays.fill(cha, '0');
        int g = 0;
        for (int i = cha.length - a.length(); i < cha.length; i++) {
            cha[i] = a.charAt(g);
            g++;
        }

        char chi[] = new char[count];
        Arrays.fill(chi, '0');
        g = 0;
        for (int i = chi.length - c.length(); i < chi.length; i++) {
            chi[i] = c.charAt(g);
            g++;
        }

        int arr[] = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cha[i] - '0';
        }


        int amm[] = new int[count];
        Arrays.fill(amm, 0);

        int bmm[] = new int[count];
        int d = count;
        for (int i = 0; i < bmm.length; i++) {
            bmm[i] = charr[32 - d] - '0';
            d--;
        }


        int cmm[] = new int[count];
        Arrays.fill(cmm, 0);
        int t = 0;

        for (int i = cmm.length - c.length(); i < cmm.length; i++) {
            cmm[i] = chi[i] - '0';
            t++;
        }
        int dmm[]= new int[count];
        Arrays.fill(dmm,0);


        int z = 0;

        while (count > 0) {
            if (arr[dmm.length - 1] == 1 && z == 0) {
                int carry = 0;
                for (int i = 0; i < dmm.length; i++) {
                    if (carry == 1) {
                        if (dmm[dmm.length-i-1] == 1 && cmm[dmm.length-i-1] == 1) {
                            dmm[dmm.length-i-1] = 1;
                        } else if (dmm[dmm.length-i-1] == 1 || cmm[dmm.length-i-1] == 1) {
                            dmm[dmm.length-i-1] = 0;
                        } else {
                            dmm[dmm.length-i-1] = 1;
                            carry--;
                        }
                    } else {
                        if (dmm[dmm.length-i-1] == 1 && cmm[dmm.length-i-1] == 1) {
                            dmm[i] = 0;
                            carry++;
                        } else if (dmm[dmm.length-i-1] == 1 || cmm[dmm.length-i-1] == 1) {
                            dmm[dmm.length-i-1] = 1;
                        } else {
                            dmm[dmm.length-i-1] = 0;
                        }
                    }
                }

            }

            if (arr[dmm.length - 1] == 0 && z == 1) {
                int carry = 0;
                for (int i = 0; i < dmm.length; i++) {
                    if (carry == 1) {
                        if (dmm[dmm.length-i-1] == 1 && bmm[dmm.length-i-1] == 1) {
                            dmm[dmm.length-i-1] = 1;
                        } else if (dmm[dmm.length-i-1] == 1 || bmm[dmm.length-i-1] == 1) {
                            dmm[dmm.length-i-1] = 0;
                        } else {
                            dmm[dmm.length-i-1] = 1;
                            carry--;
                        }
                    } else {
                        if (dmm[dmm.length-i-1] == 1 && bmm[dmm.length-i-1] == 1) {
                            dmm[dmm.length-i-1] = 0;
                            carry++;
                        } else if (dmm[dmm.length-i-1] == 1 || bmm[dmm.length-i-1] == 1) {
                            dmm[dmm.length-i-1] = 1;
                        } else {
                            dmm[dmm.length-i-1] = 0;
                        }
                    }
                }

            }
        //    System.out.println(Arrays.toString(dmm));



                z=arr[arr.length-1];

            for (int i = arr.length-1; i>0; i--) {
                arr[i]=arr[i-1];
            }
                arr[0]=dmm[dmm.length-1];
            for (int i = dmm.length-1; i >0 ; i--) {
                dmm[i]=dmm[i-1];
            }
//            System.out.println(Arrays.toString(dmm));
//            System.out.println(Arrays.toString(arr));

                count--;

            }

        int find[] = new int[2* dmm.length-1];
        int m= arr.length-1;
        for (int i = find.length-1; i >arr.length-2 ; i--) {
            find[i]=arr[m];
            m--;
        }
        m= arr.length-1;
        for (int i = arr.length-2; i >=0 ; i--) {
            find[i]=dmm[m];
            m--;
        }

        System.out.println(Arrays.toString(find));

        for (int i = 0; i < find.length; i++) {
            if(find[i]==0){
                find[i]=1;
            }
            else {
                find[i]=0;
            }
        }
        int sum=0;
        int pow=1;
        for (int i = find.length-1; i >=0; i--) {
            if(find[i]==0){
                find[i]=1;
                break;
            }
            else {
                find[i]=0;
            }
        }
        System.out.println(Arrays.toString(find));
        for (int i = find.length-1; i >=0 ; i--) {
            sum=sum+pow*find[i];
            pow=pow*2;
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(dmm));
        if(dmm[0]==1){
            System.out.println("-"+sum);
        }
        else {
            System.out.println(sum);
        }
        }
    }
