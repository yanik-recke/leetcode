package problemIntToRoman;

class Solution {

    public int romanToInt(String s) {
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I' -> {
                    if (i + 1 < s.length() && s.charAt(i + 1) == 'V') {
                        number += 4;
                        i++;
                    } else if (i + 1 < s.length() && s.charAt(i + 1) == 'X') {
                        number += 9;
                        i++;
                    } else {
                        number += 1;
                    }
                }

                case 'X' -> {
                    if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                        number += 40;
                        i++;
                    } else if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
                        number += 90;
                        i++;
                    } else {
                        number += 10;
                    }
                }

                case 'C' -> {
                    if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
                        number += 400;
                        i++;
                    } else if (i + 1 < s.length() && s.charAt(i + 1) == 'M') {
                        number += 900;
                        i++;
                    } else {
                        number += 100;
                    }
                }

                case 'V' -> {
                    number += 5;
                }

                case 'L' -> {
                    number += 50;
                }

                case 'D' -> {
                    number += 500;
                }

                default -> {
                    number += 1000;
                }
            }
        }

        return number;
    }
}
