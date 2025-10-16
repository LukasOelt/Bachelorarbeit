// Lukas Oeltjenbruns
// Bachelorarbeit, Philipps-Universitiät Marburg, 2025

package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {

        //                                Kalibrierungsphase


        Scanner myObj = new Scanner(System.in);

        double PixelAnzahlHorizontal = 1000;
        double PixelAnzahlVertikal = 1000;
        double SichtfeldHorizontal = 115; // Angaben vom Hersteller 115
        double SichtfeldVertikal = 90; // Angaben vom Hersteller
        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("Geben Sie Ihre aktuelle Position ein. (X,Y,Z) In Metern.");

        double StartPositionX = myObj.nextDouble(); // Startposition der XR-3
        double StartPositionY = myObj.nextDouble(); // Startposition der XR-3
        double StartPositionZ = myObj.nextDouble(); // Startposition der XR-3

        // Merkmal 1

        System.out.println("Geben Sie die Pixelkoordinaten für das erste Merkmal ein");

        double KoordinateHorizontal1 = myObj.nextDouble(); // Merkmal 1, Pixelkoordinate in horizontaler Richtung
        double KoordinateVertikal1 = myObj.nextDouble(); // Merkmal 1, Pixelkoordinate in vertikaler Richtung
        System.out.println("Geben Sie die Entfernung, in Zentimeter, mit drei Nachkommastellen, zu dem ersten Merkmal ein. ");

        double TeifenbildEntfernung1 = myObj.nextDouble(); // Entfernung zum ersten Merkmal

        double WinkelHorizontal1 = ((KoordinateHorizontal1 - (PixelAnzahlHorizontal / 2)) / PixelAnzahlHorizontal )
                * SichtfeldHorizontal;
        double WinkelVertikal1 = (((PixelAnzahlVertikal / 2) - KoordinateVertikal1) / PixelAnzahlVertikal )
                * SichtfeldVertikal; // Umgedrehte Reihenfolge

       // System.out.println("Winkel horizontal = " + df.format(WinkelHorizontal1) + "°");
       // System.out.println("Winkel vertikal = " + df.format(WinkelVertikal1) + "°");

        double Y_Verschiebung1 = Math.sin(Math.toRadians(WinkelVertikal1)) * (TeifenbildEntfernung1 / Math.sin(Math.toRadians(90)));

        double Strahl2_Merkmal1 = Math.sin(Math.toRadians(90 - WinkelVertikal1)) * (TeifenbildEntfernung1 / Math.sin(Math.toRadians(90)));

        double X_Verschiebung1 = Math.sin(Math.toRadians(WinkelHorizontal1)) * (Strahl2_Merkmal1 / Math.sin(Math.toRadians(90)));
        double Z_Verschiebung1 = Math.sin(Math.toRadians(90 - WinkelHorizontal1)) * (Strahl2_Merkmal1 / Math.sin(Math.toRadians(90)));

        System.out.println("Ausgaben für das erste Merkmal: X-Verschiebung beträgt " + df.format(X_Verschiebung1) + "cm" + ", Y-Verschiebung beträgt " +
                df.format(Y_Verschiebung1) + "cm" + ", Z-Verschiebung beträgt " + df.format(Z_Verschiebung1)+ "cm" );

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Merkmal 2

        System.out.println("Geben Sie die Pixelkoordinaten für das zweite Merkmal ein");

        double KoordinateHorizontal2 = myObj.nextDouble(); // Merkmal 2, Pixelkoordinate in horizontaler Richtung
        double KoordinateVertikal2 = myObj.nextDouble(); // Merkmal 2, Pixelkoordinate in vertikaler Richtung
        System.out.println("Geben Sie die Entfernung, in Zentimeter, zu dem zweiten Merkmal ein " +
                "(von dem Tiefenbild stammend, mit drei Nachkommastellen)");

        double TeifenbildEntfernung2 = myObj.nextDouble(); // Entfernung zum zweiten Merkmal

        double WinkelHorizontal2 = ((KoordinateHorizontal2 - (PixelAnzahlHorizontal / 2)) / PixelAnzahlHorizontal )
                * SichtfeldHorizontal;
        double WinkelVertikal2 = (((PixelAnzahlVertikal / 2) - KoordinateVertikal2) / PixelAnzahlVertikal )
                * SichtfeldVertikal; // Umgedrehte Reihenfolge

      //  System.out.println("Winkel horizontal = " + df.format(WinkelHorizontal2) + "°");
     //   System.out.println("Winkel vertikal = " + df.format(WinkelVertikal2) + "°");

        double Y_Verschiebung2 = Math.sin(Math.toRadians(WinkelVertikal2)) * (TeifenbildEntfernung2 / Math.sin(Math.toRadians(90)));


        double Strahl2_Merkmal2 = Math.sin(Math.toRadians(90 - WinkelVertikal2)) * (TeifenbildEntfernung2 / Math.sin(Math.toRadians(90)));

        double X_Verschiebung2 = Math.sin(Math.toRadians(WinkelHorizontal2)) * (Strahl2_Merkmal2 / Math.sin(Math.toRadians(90)));
        double Z_Verschiebung2 = Math.sin(Math.toRadians(90 - WinkelHorizontal2)) * (Strahl2_Merkmal2 / Math.sin(Math.toRadians(90)));

        System.out.println("Ausgaben für das zweite Merkmal: X-Verschiebung beträgt " + df.format(X_Verschiebung2) + "cm" + ", Y-Verschiebung beträgt " +
                df.format(Y_Verschiebung2) + "cm" + ", Z-Verschiebung beträgt " + df.format(Z_Verschiebung2)+ "cm" );

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Merkmal 3

        System.out.println("Geben Sie die Pixelkoordinaten für das dritte Merkmal ein");

        double KoordinateHorizontal3 = myObj.nextDouble(); // Merkmal 3, Pixelkoordinate in horizontaler Richtung
        double KoordinateVertikal3 = myObj.nextDouble(); // Merkmal 3, Pixelkoordinate in vertikaler Richtung
        System.out.println("Geben Sie die Entfernung, in Zentimeter, zu dem dritten Merkmal ein " +
                "(von dem Tiefenbild stammend, mit drei Nachkommastellen)");

        double TeifenbildEntfernung3 = myObj.nextDouble(); // Entfernung zum ersten Merkmal

        double WinkelHorizontal3 = ((KoordinateHorizontal3 - (PixelAnzahlHorizontal / 2)) / PixelAnzahlHorizontal )
                * SichtfeldHorizontal;
        double WinkelVertikal3 = (((PixelAnzahlVertikal / 2) - KoordinateVertikal3) / PixelAnzahlVertikal )
                * SichtfeldVertikal; // Umgedrehte Reihenfolge

     //   System.out.println("Winkel horizontal = " + df.format(WinkelHorizontal3) + "°");
     //   System.out.println("Winkel vertikal = " + df.format(WinkelVertikal3) + "°");

        double Y_Verschiebung3 = Math.sin(Math.toRadians(WinkelVertikal3)) * (TeifenbildEntfernung3 / Math.sin(Math.toRadians(90)));


        double Strahl2_Merkmal3 = Math.sin(Math.toRadians(90 - WinkelVertikal3)) * (TeifenbildEntfernung3 / Math.sin(Math.toRadians(90)));

        double X_Verschiebung3 = Math.sin(Math.toRadians(WinkelHorizontal3)) * (Strahl2_Merkmal3 / Math.sin(Math.toRadians(90)));
        double Z_Verschiebung3 = Math.sin(Math.toRadians(90 - WinkelHorizontal3)) * (Strahl2_Merkmal3 / Math.sin(Math.toRadians(90)));

        System.out.println("Ausgaben für das dritte Merkmal: X-Verschiebung beträgt " + df.format(X_Verschiebung3) + "cm" + ", Y-Verschiebung beträgt " +
                df.format(Y_Verschiebung3) + "cm" + ", Z-Verschiebung beträgt " + df.format(Z_Verschiebung3)+ "cm" );



        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //                                             Phase 2

        double[] MerkmalA = {X_Verschiebung1 + StartPositionX, Y_Verschiebung1 + StartPositionY, Z_Verschiebung1 + StartPositionZ};
        double[] MerkmalB = {X_Verschiebung2 + StartPositionX, Y_Verschiebung2 + StartPositionY, Z_Verschiebung2 + StartPositionZ};
        double[] MerkmalC = {X_Verschiebung3 + StartPositionX, Y_Verschiebung3 + StartPositionY, Z_Verschiebung3 + StartPositionZ};

        // Wir können entweder davon ausgehen, dass unsere Startposition auch gleich den Ursprung des Koordinatensystems ist,
        // also Startposition = (0,0,0), oder wir können am Anfang die Startposition von der XR-3 eingeben und in den Zeilen 126-128
        // führen wir Vektorenaddition durch und bekommen die XR-3-Koordinaten

        double SeiteA = Math.sqrt( (Math.pow(MerkmalA[0] - MerkmalB[0],2) + (Math.pow(MerkmalA[1] - MerkmalB[1],2)
                + (Math.pow(MerkmalA[2] - MerkmalB[2],2) )))); // Abstand zwischen den Merkmalen A und B, Vektor AB

        System.out.println("Geben Sie die Entfernung, in Zentimeter, mit drei Nachkommastellen, zu dem ersten Merkmal ein. ");

        double SeiteB = myObj.nextDouble(); // Entfernung zum Merkmal A, von der Kameraposition K aus, Vektor KA

        System.out.println("Geben Sie die Entfernung, in Zentimeter, mit drei Nachkommastellen, zu dem zweiten Merkmal ein. ");

        double SeiteC = myObj.nextDouble(); // Entfernung zum Merkmal B, von der Kameraposition K aus, Vektor KB

        System.out.println("Geben Sie die Entfernung, in Zentimeter, mit drei Nachkommastellen, zu dem dritten Merkmal ein. ");

        double VektorKC = myObj.nextDouble(); // Entfernung zum Merkmal C, von der Kameraposition K aus, Vektor KC



        double Alpha = Math.toDegrees(Math.acos( ((Math.pow(SeiteB, 2) + Math.pow(SeiteC, 2)) - Math.pow(SeiteA, 2))
                / (2 * SeiteB * SeiteC))); // Winkel Alpha
        double Beta = Math.toDegrees(Math.acos( ((Math.pow(SeiteA, 2) + Math.pow(SeiteC, 2)) - Math.pow(SeiteB, 2))
                / (2 * SeiteA * SeiteC))); // Winkel Beta
        double Gamma = Math.toDegrees(Math.acos( ((Math.pow(SeiteB, 2) + Math.pow(SeiteA, 2)) - Math.pow(SeiteC, 2))
                / (2 * SeiteB * SeiteA))); // Winkel gamma

/*
        double Beta = Math.toDegrees(Math.asin((SeiteB * Math.sin(Math.toRadians(Alpha)) / SeiteA))); // Sinussatz
        double Gamma = Math.toDegrees(Math.asin(SeiteC * Math.sin(Math.toRadians(Alpha)) / SeiteA)); // Sinussatz
*/

        System.out.println("Alpha: " + Alpha);
        System.out.println("Beta: " + Beta);
        System.out.println("Gamma: " + Gamma);
        System.out.println("Seite A: " + SeiteA);

        // Fall 1: Punkt K zwischen A und B
        // Fall 2: Beta größer 90°, K nicht zwischen A und B, K links von A
        // Fall 3: Gamma größer 90°, K nicht zwischen A und B, K rechts von B

        if(Alpha < 90 && Beta < 90 && Gamma < 90){ // Fall 1, K befindet sich zwischen A und B

            // Winkel

            double Beta_Zwei = 90;
            double Alpha_Zwei = 180 - (Gamma + Beta_Zwei);
            double Beta_Drei;
            double Beta_Drei_Compliment;
            double Alpha_Drei_Compliment;

            // Vektoren, Positionen und Beträge von Vektoren

            double Vektor_KX_Betrag = SeiteC / Math.sin(Math.toRadians(Beta_Zwei)) * Math.sin(Math.toRadians(Gamma));
            double Vektor_AX_Betrag = SeiteB / Math.sin(Math.toRadians(Beta_Zwei)) * Math.sin(Math.toRadians(Alpha_Zwei));

            double[] Position_X = {MerkmalA[0] + Vektor_AX_Betrag, MerkmalA[1], MerkmalA[2]}; // Position von X bekommen wir
                                                                                        // die Position von A mit Vektor AX addidert

            double[] KameraPosition = new double[3];
            double[] Vektor_CX = new double[3];
            Vektor_CX[0] = Position_X[0] - MerkmalC[0];
            Vektor_CX[1] = Position_X[1] - MerkmalC[1];
            Vektor_CX[2] = Position_X[2] - MerkmalC[2];

            double[] Vektor_BX = new double[3];
            Vektor_BX[0] = Position_X[0] - MerkmalB[0];
            Vektor_BX[1] = Position_X[1] - MerkmalB[1];
            Vektor_BX[2] = Position_X[2] - MerkmalB[2];

            double[] Vektor_AX = new double[3];
            Vektor_AX[0] = Position_X[0] - MerkmalA[0];
            Vektor_AX[1] = Position_X[1] - MerkmalA[1];
            Vektor_AX[2] = Position_X[2] - MerkmalA[2];

            double[] Punkt_C_X = new double[3];
            Punkt_C_X[0] = Position_X[0]; // Wir übernehmen die X-Position vom Punkt X
            Punkt_C_X[1] = MerkmalC[1]; // Y- und Z-Koordinate behalten wir vom Merkmal C bei.
            Punkt_C_X[2] = MerkmalC[2];

            double Vector_CX_Betrag = Math.sqrt((Vektor_CX[0] * Vektor_CX[0]) + (Vektor_CX[1] * Vektor_CX[1]) + (Vektor_CX[2] * Vektor_CX[2]));

            double Vektor_C_C_X_Betrag = Math.sqrt(Math.pow((MerkmalC[0] - Punkt_C_X[0]),2)); // Vektor CCx = X-Koordinate von C - X-Koordinate von Cx

            double Vektor_C_X_X_Betrag = Math.sqrt(Math.pow((Position_X[1] - Punkt_C_X[1]),2)); // Vektor CxX = Y-Koordinate von X - Y-Koordinate von Cx

            double Vektor_K_C_X_Betrag = Math.sqrt(Math.pow(VektorKC,2) - Math.pow(Vektor_C_C_X_Betrag,2)); // Satz des Pythagaros

            double Vektor_X_XY_Betrag;
            double Z_Verschiebung;

            /////////////////////////////////////////////////////////////////////////////////

            // Bestimmung vom Punkt XY


            if(MerkmalC[1] > MerkmalA[1]){ // Fall 1.1, Y-Koordinate von C größer die von A und B

                Beta_Drei = Math.toDegrees(Math.acos(( ( (Vektor_K_C_X_Betrag * Vektor_K_C_X_Betrag) + (Vektor_C_X_X_Betrag * Vektor_C_X_X_Betrag)
                        - (Vektor_KX_Betrag * Vektor_KX_Betrag) ) / (2 * Vektor_C_X_X_Betrag * Vektor_KX_Betrag ) )
                )); // Kosinussatz, arccos(A^2 + C^2 - B^2 / 2 * A * C)

                Beta_Drei_Compliment = 180 - Beta_Drei;
                Alpha_Drei_Compliment = 180 - 90 - Beta_Drei_Compliment;

                Vektor_X_XY_Betrag = Math.sin(Math.toRadians(Alpha_Drei_Compliment)) * Vektor_K_C_X_Betrag;
                // Sinussatz, sin(90) = 1, also sin(Alpha_Compliment) * Vektor_K_C_X
                // Vektor_X_XY ist gleich Y-Verschiebung

                // |KA->|^2 = |AX->|^2 + |XXY->|^2 + |Z-Verschiebung|^2
                // SeiteB = KA->

                Z_Verschiebung = Math.sqrt(Math.pow(SeiteB,2) - Math.pow(Vektor_AX_Betrag, 2) - Math.pow(Vektor_X_XY_Betrag, 2));

                KameraPosition[0] = (StartPositionX * 100) + Position_X[0];
                KameraPosition[1] = (StartPositionY * 100) + MerkmalC[1] + Vektor_X_XY_Betrag;
                KameraPosition[2] = (StartPositionZ * 100) + MerkmalA[2] - Z_Verschiebung;

                /*
                System.out.println(Z_Verschiebung);
                System.out.println(SeiteB);
                System.out.println(Vektor_AX_Betrag);
                System.out.println(Vektor_X_XY_Betrag);

                 */
                System.out.println("Fall 1.1: Kameraposition lautet, in der Reihenfolge X, Y, Z: (" + df.format(KameraPosition[0]) + ", "
                        + df.format(KameraPosition[1]) + ", " + df.format(KameraPosition[2]) + ")");


            }else if(MerkmalC[1] < MerkmalA[1]){ // Fall 1.2, Y-Koordinate von C kleiner die von A und B

                Beta_Drei = Math.toDegrees(Math.acos(( ( (Vektor_KX_Betrag * Vektor_KX_Betrag) + (Vektor_C_X_X_Betrag * Vektor_C_X_X_Betrag) - (Vektor_K_C_X_Betrag * Vektor_K_C_X_Betrag) )
                        / (2 * Vektor_C_X_X_Betrag * Vektor_KX_Betrag ) )
                )); // Kosinussatz, arccos(A^2 + C^2 - B^2 / 2 * A * C)

                Beta_Drei_Compliment = 180 - Beta_Drei;
                Alpha_Drei_Compliment = 180 - 90 - Beta_Drei_Compliment;

                Vektor_X_XY_Betrag = Math.sin(Math.toRadians(Alpha_Drei_Compliment)) * Vektor_KX_Betrag;
                // Sinussatz, sin(90) = 1 also sin(Alpha_Compliment) * Vektor_KX
                // Vektor_X_XY ist gleich Y-Verschiebung

                // |KA->|^2 = |AX->|^2 + |XXY->|^2 + |Z-Verschiebung|^2
                // SeiteB = KA->

                Z_Verschiebung = Math.sqrt(Math.pow(SeiteB,2) - Math.pow(Vektor_AX_Betrag, 2) - Math.pow(Vektor_X_XY_Betrag, 2));

                KameraPosition[0] = (StartPositionX * 100) + Position_X[0];
                KameraPosition[1] = (StartPositionY * 100) + MerkmalA[1] + Vektor_X_XY_Betrag;
                KameraPosition[2] = (StartPositionZ * 100) + MerkmalA[2] - Z_Verschiebung;

                System.out.println("Fall 1.2: Kameraposition lautet, in der Reihenfolge X, Y, Z: (" + df.format(KameraPosition[0]) + ", " + df.format(KameraPosition[1]) + ", " + df.format(KameraPosition[2]) + ")");

            }


        }else if(Gamma > 90){ // Fall 2

            // Winkel

            double Beta_Zwei = 90;
            double Gamma_Zwei = 180 - Gamma;
            double Alpha_Zwei = 180 - (Gamma_Zwei + Beta_Zwei);
            double Beta_Drei;
            double Beta_Drei_Compliment;
            double Alpha_Drei_Compliment;

            double Vektor_KX_Betrag = SeiteB / Math.sin(Math.toRadians(Beta_Zwei)) * Math.sin(Math.toRadians(Gamma_Zwei));
          //  double Vektor_KX_Betrag = SeiteC / Math.sin(Math.toRadians(Beta_Zwei)) * Math.sin(Math.toRadians(Gamma_Zwei));
            double Vektor_AX_Betrag = SeiteB / Math.sin(Math.toRadians(Beta_Zwei)) * Math.sin(Math.toRadians(Alpha_Zwei));

            double[] Position_X = {MerkmalA[0] - Vektor_AX_Betrag, MerkmalA[1], MerkmalA[2]}; // Position von X bekommen wir
            // die Position von A statt sonst B mit dem Vektor AX addidert

            double[] KameraPosition = new double[3];
            double[] Vektor_CX = new double[3];
            Vektor_CX[0] = Position_X[0] - MerkmalC[0];
            Vektor_CX[1] = Position_X[1] - MerkmalC[1];
            Vektor_CX[2] = Position_X[2] - MerkmalC[2];

            double[] Vektor_BX = new double[3];
            Vektor_BX[0] = Position_X[0] - MerkmalB[0];
            Vektor_BX[1] = Position_X[1] - MerkmalB[1];
            Vektor_BX[2] = Position_X[2] - MerkmalB[2];

            double[] Vektor_AX = new double[3];
            Vektor_AX[0] = Position_X[0] - MerkmalA[0];
            Vektor_AX[1] = Position_X[1] - MerkmalA[1];
            Vektor_AX[2] = Position_X[2] - MerkmalA[2];

            double[] Punkt_C_X = new double[3];
            Punkt_C_X[0] = Position_X[0]; // Wir übernehmen die X-Position vom Punkt X
            Punkt_C_X[1] = MerkmalC[1]; // Y- und Z-Koordinate behalten wir vom Merkmal C bei.
            Punkt_C_X[2] = MerkmalC[2];

            double Vector_CX_Betrag = Math.sqrt((Vektor_CX[0] * Vektor_CX[0]) + (Vektor_CX[1] * Vektor_CX[1]) + (Vektor_CX[2] * Vektor_CX[2]));

            double Vektor_C_C_X_Betrag = Math.sqrt(Math.pow((MerkmalC[0] - Punkt_C_X[0]),2)); // Vektor CCx = X-Koordinate von C - X-Koordinate von Cx

            double Vektor_C_X_X_Betrag = Math.sqrt(Math.pow((Position_X[1] - Punkt_C_X[1]),2)); // Vektor CxX = Y-Koordinate von X - Y-Koordinate von Cx

            double Vektor_K_C_X_Betrag = Math.sqrt(Math.pow(VektorKC,2) - Math.pow(Vektor_C_C_X_Betrag,2)); // Satz des Pythagaros

            double Vektor_X_XY_Betrag;
            double Z_Verschiebung;

            if(MerkmalC[1] > MerkmalA[1]){ // Fall 2.1, Y-Koordinate von C größer die von A und B
                Beta_Drei = Math.toDegrees(Math.acos(( ( (Vektor_K_C_X_Betrag * Vektor_K_C_X_Betrag) + (Vektor_C_X_X_Betrag * Vektor_C_X_X_Betrag)
                        - (Vektor_KX_Betrag * Vektor_KX_Betrag) ) / (2 * Vektor_C_X_X_Betrag * Vektor_KX_Betrag ) )
                )); // Kosinussatz, arccos(A^2 + C^2 - B^2 / 2 * A * C)

                Beta_Drei_Compliment = 180 - Beta_Drei;
                Alpha_Drei_Compliment = 180 - 90 - Beta_Drei_Compliment;

                Vektor_X_XY_Betrag = Math.sin(Math.toRadians(Alpha_Drei_Compliment)) * Vektor_KX_Betrag;
                // Sinussatz, sin(90) = 1 also sin(Alpha_Compliment) * Vektor_KX
                // Vektor_X_XY ist gleich Y-Verschiebung

                // |KA->|^2 = |AX->|^2 + |XXY->|^2 + |Z-Verschiebung|^2
                // SeiteB = KA->

                Z_Verschiebung = Math.sqrt(Math.pow(SeiteB,2) - Math.pow(Vektor_AX_Betrag, 2) - Math.pow(Vektor_X_XY_Betrag, 2));

                KameraPosition[0] = (StartPositionX * 100) + Position_X[0];
                KameraPosition[1] = (StartPositionY * 100) + MerkmalA[1] + Vektor_X_XY_Betrag;
                KameraPosition[2] = (StartPositionZ * 100) + MerkmalA[2] - Z_Verschiebung;

                System.out.println(Z_Verschiebung);
                System.out.println(SeiteB);
                System.out.println(Vektor_AX_Betrag);
                System.out.println(Vektor_X_XY_Betrag);

                System.out.println("Fall 2.1: Kameraposition lautet, in der Reihenfolge X, Y, Z: (" + df.format(KameraPosition[0]) + ", "
                        + df.format(KameraPosition[1]) + ", " + df.format(KameraPosition[2]) + ")");

            }else if(MerkmalC[1] < MerkmalA[1]){ // Fall 2.2, Y-Koordinate von C kleiner als die von A und B

                Beta_Drei = Math.toDegrees(Math.acos(( ( (Vektor_KX_Betrag * Vektor_KX_Betrag) + (Vektor_C_X_X_Betrag * Vektor_C_X_X_Betrag) - (Vektor_K_C_X_Betrag * Vektor_K_C_X_Betrag) )
                        / (2 * Vektor_C_X_X_Betrag * Vektor_KX_Betrag ) )
                )); // Kosinussatz, arccos(A^2 + C^2 - B^2 / 2 * A * C)

                Beta_Drei_Compliment = 180 - Beta_Drei;
                Alpha_Drei_Compliment = 180 - 90 - Beta_Drei_Compliment;

                Vektor_X_XY_Betrag = Math.sin(Math.toRadians(Alpha_Drei_Compliment)) * Vektor_KX_Betrag;
                // Sinussatz, sin(90) = 1 also sin(Alpha_Compliment) * Vektor_KX
                // Vektor_X_XY ist gleich Y-Verschiebung

                // |KA->|^2 = |AX->|^2 + |XXY->|^2 + |Z-Verschiebung|^2
                // SeiteB = KA->

                Z_Verschiebung = Math.sqrt(Math.pow(SeiteB,2) - Math.pow(Vektor_AX_Betrag, 2) - Math.pow(Vektor_X_XY_Betrag, 2));

                KameraPosition[0] = (StartPositionX * 100) + Position_X[0];
                KameraPosition[1] = (StartPositionY * 100) + MerkmalA[1] + Vektor_X_XY_Betrag;
                KameraPosition[2] = (StartPositionZ * 100) + MerkmalA[2] - Z_Verschiebung;

                System.out.println("Fall 2.2: Kameraposition lautet, in der Reihenfolge X, Y, Z: (" + df.format(KameraPosition[0]) + ", " + df.format(KameraPosition[1]) + ", " + df.format(KameraPosition[2]) + ")");


            }


        }else if(Beta > 90){ // Fall 3

            // Winkel

            double Beta_Zwei = 90;
            double Gamma_Zwei = 180 - Gamma;
            double Alpha_Zwei = 180 - (Gamma_Zwei + Beta_Zwei);
            double Beta_Drei;
            double Beta_Drei_Compliment;
            double Alpha_Drei_Compliment;

            double Vektor_KX_Betrag = SeiteB / Math.sin(Math.toRadians(Beta_Zwei)) * Math.sin(Math.toRadians(Gamma_Zwei));
            //  double Vektor_KX_Betrag = SeiteC / Math.sin(Math.toRadians(Beta_Zwei)) * Math.sin(Math.toRadians(Gamma_Zwei));
            double Vektor_AX_Betrag = SeiteB / Math.sin(Math.toRadians(Beta_Zwei)) * Math.sin(Math.toRadians(Alpha_Zwei));

            double[] Position_X = {MerkmalA[0] - Vektor_AX_Betrag, MerkmalA[1], MerkmalA[2]}; // Position von X bekommen wir
            // die Position von A statt sonst B mit dem Vektor AX addidert

            double[] KameraPosition = new double[3];
            double[] Vektor_CX = new double[3];
            Vektor_CX[0] = Position_X[0] - MerkmalC[0];
            Vektor_CX[1] = Position_X[1] - MerkmalC[1];
            Vektor_CX[2] = Position_X[2] - MerkmalC[2];

            double[] Vektor_BX = new double[3];
            Vektor_BX[0] = Position_X[0] - MerkmalB[0];
            Vektor_BX[1] = Position_X[1] - MerkmalB[1];
            Vektor_BX[2] = Position_X[2] - MerkmalB[2];

            double[] Vektor_AX = new double[3];
            Vektor_AX[0] = Position_X[0] - MerkmalA[0];
            Vektor_AX[1] = Position_X[1] - MerkmalA[1];
            Vektor_AX[2] = Position_X[2] - MerkmalA[2];

            double[] Punkt_C_X = new double[3];
            Punkt_C_X[0] = Position_X[0]; // Wir übernehmen die X-Position vom Punkt X
            Punkt_C_X[1] = MerkmalC[1]; // Y- und Z-Koordinate behalten wir vom Merkmal C bei.
            Punkt_C_X[2] = MerkmalC[2];

            double Vector_CX_Betrag = Math.sqrt((Vektor_CX[0] * Vektor_CX[0]) + (Vektor_CX[1] * Vektor_CX[1]) + (Vektor_CX[2] * Vektor_CX[2]));

            double Vektor_C_C_X_Betrag = Math.sqrt(Math.pow((MerkmalC[0] - Punkt_C_X[0]),2)); // Vektor CCx = X-Koordinate von C - X-Koordinate von Cx

            double Vektor_C_X_X_Betrag = Math.sqrt(Math.pow((Position_X[1] - Punkt_C_X[1]),2)); // Vektor CxX = Y-Koordinate von X - Y-Koordinate von Cx

            double Vektor_K_C_X_Betrag = Math.sqrt(Math.pow(VektorKC,2) - Math.pow(Vektor_C_C_X_Betrag,2)); // Satz des Pythagaros

            double Vektor_X_XY_Betrag;
            double Z_Verschiebung;

            if(MerkmalC[1] > MerkmalA[1]){ // Fall 2.1, Y-Koordinate von C größer die von A und B
                Beta_Drei = Math.toDegrees(Math.acos(( ( (Vektor_K_C_X_Betrag * Vektor_K_C_X_Betrag) + (Vektor_C_X_X_Betrag * Vektor_C_X_X_Betrag)
                        - (Vektor_KX_Betrag * Vektor_KX_Betrag) ) / (2 * Vektor_C_X_X_Betrag * Vektor_KX_Betrag ) )
                )); // Kosinussatz, arccos(A^2 + C^2 - B^2 / 2 * A * C)

                Beta_Drei_Compliment = 180 - Beta_Drei;
                Alpha_Drei_Compliment = 180 - 90 - Beta_Drei_Compliment;

                Vektor_X_XY_Betrag = Math.sin(Math.toRadians(Alpha_Drei_Compliment)) * Vektor_KX_Betrag;
                // Sinussatz, sin(90) = 1 also sin(Alpha_Compliment) * Vektor_KX
                // Vektor_X_XY ist gleich Y-Verschiebung

                // |KA->|^2 = |AX->|^2 + |XXY->|^2 + |Z-Verschiebung|^2
                // SeiteB = KA->

                Z_Verschiebung = Math.sqrt(Math.pow(SeiteB,2) - Math.pow(Vektor_AX_Betrag, 2) - Math.pow(Vektor_X_XY_Betrag, 2));

                KameraPosition[0] = (StartPositionX * 100) + Position_X[0];
                KameraPosition[1] = (StartPositionY * 100) + MerkmalA[1] + Vektor_X_XY_Betrag;
                KameraPosition[2] = (StartPositionZ * 100) + MerkmalA[2] - Z_Verschiebung;

                System.out.println(Z_Verschiebung);
                System.out.println(SeiteB);
                System.out.println(Vektor_AX_Betrag);
                System.out.println(Vektor_X_XY_Betrag);

                System.out.println("Fall 3.1: Kameraposition lautet, in der Reihenfolge X, Y, Z: (" + df.format(KameraPosition[0]) + ", "
                        + df.format(KameraPosition[1]) + ", " + df.format(KameraPosition[2]) + ")");

            }else if(MerkmalC[1] < MerkmalA[1]){ // Fall 2.2, Y-Koordinate von C kleiner als die von A und B

                Beta_Drei = Math.toDegrees(Math.acos(( ( (Vektor_KX_Betrag * Vektor_KX_Betrag) + (Vektor_C_X_X_Betrag * Vektor_C_X_X_Betrag) - (Vektor_K_C_X_Betrag * Vektor_K_C_X_Betrag) )
                        / (2 * Vektor_C_X_X_Betrag * Vektor_KX_Betrag ) )
                )); // Kosinussatz, arccos(A^2 + C^2 - B^2 / 2 * A * C)

                Beta_Drei_Compliment = 180 - Beta_Drei;
                Alpha_Drei_Compliment = 180 - 90 - Beta_Drei_Compliment;

                Vektor_X_XY_Betrag = Math.sin(Math.toRadians(Alpha_Drei_Compliment)) * Vektor_KX_Betrag;
                // Sinussatz, sin(90) = 1 also sin(Alpha_Compliment) * Vektor_KX
                // Vektor_X_XY ist gleich Y-Verschiebung

                // |KA->|^2 = |AX->|^2 + |XXY->|^2 + |Z-Verschiebung|^2
                // SeiteB = KA->

                Z_Verschiebung = Math.sqrt(Math.pow(SeiteB,2) - Math.pow(Vektor_AX_Betrag, 2) - Math.pow(Vektor_X_XY_Betrag, 2));

                KameraPosition[0] = (StartPositionX * 100) + Position_X[0];
                KameraPosition[1] = (StartPositionY * 100) + MerkmalA[1] + Vektor_X_XY_Betrag;
                KameraPosition[2] = (StartPositionZ * 100) + MerkmalA[2] - Z_Verschiebung;

                System.out.println("Fall 3.2: Kameraposition lautet, in der Reihenfolge X, Y, Z: (" + df.format(KameraPosition[0]) + ", " + df.format(KameraPosition[1]) + ", " + df.format(KameraPosition[2]) + ")");


            }
        }






























        /*

        System.out.println("Geben Sie die Position von dem Inside-Out Tracking ein. (X,Y,Z)");
        double UrsprungX = myObj.nextDouble();
        double UrsprungY = myObj.nextDouble();
        double UrsprungZ = myObj.nextDouble();

       // DecimalFormat numberFormat = new DecimalFormat("#.000 cm");

        double BetaX2 = 180 - hWinkelRechts;
        double AlphaX2 = 180 - (BetaX2 + hWinkelLinks);

        double AbstandB2 = Math.sin(Math.toRadians(hWinkelLinks)) * (A2/Math.sin(Math.toRadians(AlphaX2))); //Sinussatz
        double AbstandC2 = Math.sin(Math.toRadians(BetaX2)) * (A2/Math.sin(Math.toRadians(AlphaX2))); //Sinussatz

        System.out.println("Seitenlänge B = " + numberFormat.format(AbstandB2));
        System.out.println("Seitenlänge C = " + numberFormat.format(AbstandC2));

        double Anew2 = A2 / 2; //Tracking Point ist genau in der Mitte zwischen den Augen
        double vector2 = Math.sqrt( ((Anew2 * Anew2) + (AbstandC2 * AbstandC2)) - (2 * Anew2 * AbstandC2 * Math.cos(Math.toRadians(hWinkelLinks)))); // Kosinussatz

        System.out.println("Unser Vektor hat den Betrag = " + numberFormat.format(vector2));

        double VektorX2 = (hWinkelLinks + hWinkelRechts) / 2;
        double VerschiebungX2 = vector2/Math.sin(Math.toRadians(VektorX2)) * Math.sin(Math.toRadians(90 - VektorX2));

      //  System.out.println("Die Verschiebung in X-Richtung beträgt " + numberFormat.format(VerschiebungX2) );

        double VerschiebungY2 = Math.sin(Math.toRadians(vWinkelLinks)) * (vector2 / Math.sin(Math.toRadians(90)));
        double VerschiebungZ2 = Math.sqrt((vector2 * vector2) - (VerschiebungY2 * VerschiebungY2));

        double PostionMerkmalX = UrsprungX + VerschiebungX2;
        double PostionMerkmalY = UrsprungY + VerschiebungY2;
        double PostionMerkmalZ = UrsprungZ + VerschiebungZ2;

        System.out.println("Unser Merkmal hat die Positon (" + numberFormat.format(PostionMerkmalX) + ", "
                + numberFormat.format(PostionMerkmalY) + ", " + numberFormat.format(PostionMerkmalZ) + ")");


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Geben Sie den horizontalen und den vertikalen Winkel für das linke Auge ein");
        double hWinkelLinks2 = myObj.nextDouble();
        double vWinkelLinks2 = myObj.nextDouble();

        System.out.println("Geben Sie den horizontalen und den vertikalen Winkel für das rechte Auge ein");
        double hWinkelRechts2 = myObj.nextDouble();
        double vWinkelRechts2 = myObj.nextDouble();

        System.out.println("Geben Sie die Position von dem Inside-Out Tracking ein. (X,Y,Z)");
        double postionTrackingX = myObj.nextDouble();
        double postionTrackingY = myObj.nextDouble();
        double postionTrackingZ = myObj.nextDouble();


        double BetaX3 = 180 - hWinkelRechts2;
        double AlphaX3 = 180 - (BetaX3 + hWinkelLinks2);

        double AbstandB3 = Math.sin(Math.toRadians(hWinkelLinks2)) * (A2/Math.sin(Math.toRadians(AlphaX3))); //Sinussatz
        double AbstandC3 = Math.sin(Math.toRadians(BetaX3)) * (A2/Math.sin(Math.toRadians(AlphaX3))); //Sinussatz

        System.out.println("Seitenlänge B = " + numberFormat.format(AbstandB3));
        System.out.println("Seitenlänge C = " + numberFormat.format(AbstandC3));

        double Anew3 = A2 / 2; //Tracking Point ist genau in der Mitte zwischen den Augen
        double vector3 = Math.sqrt( ((Anew3 * Anew3) + (AbstandC3 * AbstandC3)) - (2 * Anew3 * AbstandC3 * Math.cos(Math.toRadians(hWinkelLinks2)))); // Kosinussatz

        System.out.println("Unser Vektor hat den Betrag = " + numberFormat.format(vector3));

        double VektorX3 = (hWinkelLinks2 + hWinkelRechts2) / 2;
        double VerschiebungX3 = vector3/Math.sin(Math.toRadians(VektorX3)) * Math.sin(Math.toRadians(90 - VektorX3));

        System.out.println("Die Verschiebung in X-Richtung beträgt " + numberFormat.format(VerschiebungX3) );

        double VerschiebungY3 = Math.sin(Math.toRadians(vWinkelLinks2)) * (vector3 / Math.sin(Math.toRadians(90)));
        double VerschiebungZ3 = Math.sqrt((vector3 * vector3) - (VerschiebungY3 * VerschiebungY3));

        System.out.println("Unser Merkmal hat die Positon (" + numberFormat.format(VerschiebungX3) + ", "
                + numberFormat.format(VerschiebungY3) + ", " + numberFormat.format(VerschiebungZ3) + ")");

        double Fehlertoleranz = 0.05;

        if(( (postionTrackingX + VerschiebungX3) - PostionMerkmalX == Math.abs(Fehlertoleranz)) && ( (postionTrackingY + VerschiebungY3) - PostionMerkmalY
                == Math.abs(Fehlertoleranz)) && (postionTrackingZ + VerschiebungZ3) - PostionMerkmalZ == Math.abs(Fehlertoleranz)){
            System.out.println("Keinen Drift konnte festgestellt werden");

        }
        else{
            double richtigePositionX = PostionMerkmalX - VerschiebungX3;
            double richtigePositionY = PostionMerkmalY - VerschiebungY3;
            double richtigePositionZ = PostionMerkmalZ - VerschiebungZ3;

            System.out.println("Unsere aktuelle Positon lautet (" + numberFormat.format(richtigePositionX) + ", "
                    + numberFormat.format(richtigePositionY) + ", " + numberFormat.format(richtigePositionZ) + ")");
        }
*/

          /*

        double A = 7.2; // Given, Abstand zwischen den Augen in cm
        double ThetaX1 = 82.78; // Winkel horizontal, linkes Auge
        double ThetaY1  = 9.76; // Winkel vertikal, linkes Auge
        double AugeRechtsX1  = 180 - ThetaX1; // Winkel horizontal, rechtes Auge
        double AugeRechtsY1  = 9.76; // Winkel horizontal, linkes Auge

        DecimalFormat numberFormat = new DecimalFormat("#.000 cm");

        double BetaX1 = 180 - AugeRechtsX1;
        double AlphaX1 = 180 - (BetaX1 + ThetaX1);

        double AbstandB1 = Math.sin(Math.toRadians(ThetaX1)) * (A/Math.sin(Math.toRadians(AlphaX1))); //Sinussatz
        double AbstandC1 = Math.sin(Math.toRadians(BetaX1)) * (A/Math.sin(Math.toRadians(AlphaX1))); //Sinussatz

        System.out.println("Seitenlänge B = " + numberFormat.format(AbstandB1));
        System.out.println("Seitenlänge C = " + numberFormat.format(AbstandC1));

        double Anew1 = A / 2; //Tracking Point ist genau in der Mitte zwischen den Augen
        double vector1 = Math.sqrt( ((Anew1 * Anew1) + (AbstandC1 * AbstandC1)) - (2 * Anew1 * AbstandC1 * Math.cos(Math.toRadians(ThetaX1)))); // Kosinussatz

        System.out.println("Unser Vektor hat den Betrag = " + numberFormat.format(vector1));

        double VektorX1 = (ThetaX1 + AugeRechtsX1) / 2;
        double VerschiebungX1 = vector1/Math.sin(Math.toRadians(VektorX1)) * Math.sin(Math.toRadians(90 - VektorX1));

        System.out.println("Die Verschiebung in X-Richtung beträgt " + numberFormat.format(VerschiebungX1) );

        double VerschiebungY1 = Math.sin(Math.toRadians(ThetaY1)) * (vector1 / Math.sin(Math.toRadians(90)));
        double VerschiebungZ1 = Math.sqrt((vector1 * vector1) - (VerschiebungY1 * VerschiebungY1));

        System.out.println("Unser Merkmal hat die Positon (" + numberFormat.format(VerschiebungX1) + ", "
                + numberFormat.format(VerschiebungY1) + ", " + numberFormat.format(VerschiebungZ1) + ")");


*/

    }

    }

