package front;
import simulation.NerstEquations;
import simulation.Values;

import javax.swing.*;
import java.awt.*;
import java.security.spec.ECField;

/**
 * Gombokkal lehessen mozgatni 1-et az értékeket
 */

public class SlideBars extends JFrame {

        private final JSlider pnSlider, pkSlider, pcSlider, tSlider, enSlider, inSlider, ekSlider, ikSlider, ecSlider, icSlider;
        private final JLabel pnLabel, pkLabel, pcLabel, tLabel, enLabel, ekLabel, ecLabel, inLabel, ikLabel, icLabel;

        private final JLabel NaPotentialLabel, CLPotentialLabel, KPotentialLabel, overallPotentialLabel, NaVal, KVal, ClVal, OVal;

        private final JButton pnSliderMinus, pkSliderMinus, pcSliderMinus, tSliderMinus, enSliderMinus, inSliderMinus, ekSliderMinus;
        private final JButton ikSliderMinus, ecSliderMinus, icSliderMinus, pnSliderPlus, pkSliderPlus, pcSliderPlus, tSliderPlus, enSliderPlus, inSliderPlus;
        private final JButton ekSliderPlus, ikSliderPlus, ecSliderPlus, icSliderPlus;

        public SlideBars() {

                super("Input GUI");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(new GridLayout(14, 4));

                // Create sliders for PN, PK, PC, and T
                pnSlider = new JSlider(JSlider.HORIZONTAL, 0, 10000, 100);
                enSlider = new JSlider(JSlider.HORIZONTAL, 1, 600, 100);
                inSlider = new JSlider(JSlider.HORIZONTAL, 1, 200, 100);
                pkSlider = new JSlider(JSlider.HORIZONTAL, 0, 10000, 100);
                ekSlider = new JSlider(JSlider.HORIZONTAL, 1, 600, 100);
                ikSlider = new JSlider(JSlider.HORIZONTAL, 1, 200, 100);
                pcSlider = new JSlider(JSlider.HORIZONTAL, 0, 10000, 100);
                ecSlider = new JSlider(JSlider.HORIZONTAL, 1, 600, 100);
                icSlider = new JSlider(JSlider.HORIZONTAL, 1, 200, 100);
                tSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 25);

                // Create labels for PN, PK, PC, and T
                pnLabel = new JLabel("Permeability of Na: " + pnSlider.getValue());
                enLabel = new JLabel("Extracellular cc for Na (mM): " + enSlider.getValue());
                inLabel = new JLabel("Intracellular cc for Na (mM): " + inSlider.getValue());
                pkLabel = new JLabel("Permeability of K: " + pkSlider.getValue());
                ekLabel = new JLabel("Extracellular cc for K (mM): " + ekSlider.getValue());
                ikLabel = new JLabel("Intracellular cc for K (mM): " + ikSlider.getValue());
                pcLabel = new JLabel("Permeability of Cl: " + pcSlider.getValue());
                ecLabel = new JLabel("Extracellular cc for Cl (mM): " + ecSlider.getValue());
                icLabel = new JLabel("Intracellular cc for Cl (mM): " + icSlider.getValue());

                pnSliderMinus = new JButton("<-");
                pkSliderMinus = new JButton("<-");
                pcSliderMinus = new JButton("<-");
                tSliderMinus = new JButton("<-");
                enSliderMinus = new JButton("<-");
                inSliderMinus = new JButton("<-");
                ekSliderMinus = new JButton("<-");
                ikSliderMinus = new JButton("<-");
                ecSliderMinus = new JButton("<-");
                icSliderMinus = new JButton("<-");
                pnSliderPlus = new JButton("->");
                pkSliderPlus = new JButton("->");
                pcSliderPlus = new JButton("->");
                tSliderPlus = new JButton("->");
                enSliderPlus = new JButton("->");
                inSliderPlus = new JButton("->");
                ekSliderPlus = new JButton("->");
                ikSliderPlus = new JButton("->");
                ecSliderPlus = new JButton("->");
                icSliderPlus = new JButton("->");

                pnSliderMinus.addActionListener(a -> {
                    pnSlider.setValue(pnSlider.getValue() - 1);
                });

                pkSliderMinus.addActionListener(a -> {
                    pkSlider.setValue(pkSlider.getValue() - 1);
                });

                pcSliderMinus.addActionListener(a -> {
                    pcSlider.setValue(pcSlider.getValue() - 1);
                });

                tSliderMinus.addActionListener(a -> {
                    tSlider.setValue(tSlider.getValue() - 1);
                });

                enSliderMinus.addActionListener(a -> {
                    enSlider.setValue(enSlider.getValue() - 1);
                });

                inSliderMinus.addActionListener(a -> {
                    inSlider.setValue(inSlider.getValue() - 1);
                });

                ekSliderMinus.addActionListener(a -> {
                    ekSlider.setValue(ekSlider.getValue() - 1);
                });

                ikSliderMinus.addActionListener(a -> {
                    ikSlider.setValue(ikSlider.getValue() - 1);
                });

                ecSliderMinus.addActionListener(a -> {
                    ecSlider.setValue(ecSlider.getValue() - 1);
                });

                icSliderMinus.addActionListener(a -> {
                    icSlider.setValue(icSlider.getValue() - 1);
                });

                pnSliderPlus.addActionListener(a -> {
                    pnSlider.setValue(pnSlider.getValue() + 1);
                });

                pkSliderPlus.addActionListener(a -> {
                    pkSlider.setValue(pkSlider.getValue() + 1);
                });

                pcSliderPlus.addActionListener(a -> {
                    pcSlider.setValue(pcSlider.getValue() + 1);
                });

                tSliderPlus.addActionListener(a -> {
                    tSlider.setValue(tSlider.getValue() + 1);
                });

                enSliderPlus.addActionListener(a -> {
                    enSlider.setValue(enSlider.getValue() + 1);
                });

                inSliderPlus.addActionListener(a -> {
                    inSlider.setValue(inSlider.getValue() + 1);
                });

                ekSliderPlus.addActionListener(a -> {
                    ekSlider.setValue(ekSlider.getValue() + 1);
                });

                ikSliderPlus.addActionListener(a -> {
                    ikSlider.setValue(ikSlider.getValue() + 1);
                });

                ecSliderPlus.addActionListener(a -> {
                    ecSlider.setValue(ecSlider.getValue() + 1);
                });

                icSliderPlus.addActionListener(a -> {
                    icSlider.setValue(icSlider.getValue() + 1);
                });


                tLabel = new JLabel("Temperature: (°C) " + tSlider.getValue());
                NaPotentialLabel = new JLabel("Sodium equilibrium potential: ");
                CLPotentialLabel = new JLabel("Chloride equilibrium potential: ");
                KPotentialLabel = new JLabel("Potassium equilibrium potential: ");
                overallPotentialLabel = new JLabel("Overall membrane potential: ");
                NaVal = new JLabel("0 (mV)");
                KVal = new JLabel("0 (mV)");
                ClVal = new JLabel("0 (mV)");
                OVal = new JLabel("0 (mV)");


                // Add change listeners to sliders to update labels
                pnSlider.addChangeListener(e -> {
                    pnLabel.setText("Permeability of Na (mM): " + pnSlider.getValue());
                    OVal.setText(String.valueOf(NerstEquations.membranePotential()) + " (mV)");
                });
                enSlider.addChangeListener(e -> {
                    enLabel.setText("Extracellular cc for Na (mM): " + enSlider.getValue());
                    OVal.setText(String.valueOf(NerstEquations.membranePotential()) + " (mV)");
                    NaVal.setText(String.valueOf(NerstEquations.sodiumPotential()) + " (mV)");
                });
                inSlider.addChangeListener(e -> {
                    inLabel.setText("Intracellular cc for Na (mM): " + inSlider.getValue());
                    OVal.setText(String.valueOf(NerstEquations.membranePotential()) + " (mV)");
                    NaVal.setText(String.valueOf(NerstEquations.sodiumPotential()) + " (mV)");
                });
                pkSlider.addChangeListener(e -> {
                    pkLabel.setText("Permeability of Potassium: " + pkSlider.getValue());
                    OVal.setText(String.valueOf(NerstEquations.membranePotential()) + " (mV)");
                });
                ekSlider.addChangeListener(e -> {
                    ekLabel.setText("Extracellular cc for K (mM): " + ekSlider.getValue());
                    OVal.setText(String.valueOf(NerstEquations.membranePotential()) + " (mV)");
                    KVal.setText(String.valueOf(NerstEquations.potassiumPotential()) + " (mV)");
                });
                ikSlider.addChangeListener(e -> {
                    ikLabel.setText("Intracellular cc for K (mM): " + ikSlider.getValue());
                    OVal.setText(String.valueOf(NerstEquations.membranePotential()) + " (mV)");
                    KVal.setText(String.valueOf(NerstEquations.potassiumPotential()) + " (mV)");
                });
                ecSlider.addChangeListener(e -> {
                    ecLabel.setText("Extracellular cc for Cl (mM): " + ecSlider.getValue());
                    OVal.setText(String.valueOf(NerstEquations.membranePotential()) + " (mV)");
                    ClVal.setText(String.valueOf(NerstEquations.chloridePotential()) + " (mV)");
                });
                icSlider.addChangeListener(e -> {
                    icLabel.setText("Intracellular cc for Cl (mM): " + icSlider.getValue());
                    OVal.setText(String.valueOf(NerstEquations.membranePotential()) + " (mV)");
                    ClVal.setText(String.valueOf(NerstEquations.chloridePotential()) + " (mV)");
                });
                pcSlider.addChangeListener(e -> {
                    pcLabel.setText("Permeability of Chloride: " + pcSlider.getValue());
                    OVal.setText(String.valueOf(NerstEquations.membranePotential()) + " (mV)");
                });
                tSlider.addChangeListener(e -> {
                    tLabel.setText("Temperature: (°C) " + tSlider.getValue());
                    OVal.setText(String.valueOf(NerstEquations.membranePotential()) + " (mV)");
                    ClVal.setText(String.valueOf(NerstEquations.chloridePotential()) + " (mV)");
                    KVal.setText(String.valueOf(NerstEquations.potassiumPotential()) + " (mV)");
                    NaVal.setText(String.valueOf(NerstEquations.sodiumPotential()) + " (mV)");
                });
                // Add sliders and labels to GUI
                add(pnLabel);
                add(pnSlider);
                add(pnSliderMinus);
                add(pnSliderPlus);

                add(enLabel);
                add(enSlider);
                add(enSliderMinus);
                add(enSliderPlus);

                add(inLabel);
                add(inSlider);
                add(inSliderMinus);
                add(inSliderPlus);

                add(pkLabel);
                add(pkSlider);
                add(pkSliderMinus);
                add(pkSliderPlus);

                add(ekLabel);
                add(ekSlider);
                add(ekSliderMinus);
                add(ekSliderPlus);

                add(ikLabel);
                add(ikSlider);
                add(ikSliderMinus);
                add(ikSliderPlus);

                add(pcLabel);
                add(pcSlider);
                add(pcSliderMinus);
                add(pcSliderPlus);

                add(ecLabel);
                add(ecSlider);
                add(ecSliderMinus);
                add(ecSliderPlus);

                add(icLabel);
                add(icSlider);
                add(icSliderMinus);
                add(icSliderPlus);

                add(tLabel);
                add(tSlider);
                add(newEmptyButton());
                add(newEmptyButton());

                add(NaPotentialLabel);
                add(NaVal);
                add(newEmptyButton());
                add(newEmptyButton());

                add(KPotentialLabel);
                add(KVal);
                add(newEmptyButton());
                add(newEmptyButton());

                add(CLPotentialLabel);
                add(ClVal);
                add(newEmptyButton());
                add(newEmptyButton());

                add(overallPotentialLabel);
                add(OVal);
                add(newEmptyButton());
                add(newEmptyButton());

                pack();
                setLocationRelativeTo(null);
                setVisible(true);

        }

        public void updateValues(){


                Values.NaPermeability = pnSlider.getValue() / 10000.0;
                Values.NaExtracellularConcentration = enSlider.getValue();
                Values.NaIntracellularConcentration = inSlider.getValue();
                Values.potassiumPermeability = pkSlider.getValue() / 10000.0;

                Values.potassiumExtracellularConcentration = ekSlider.getValue();
                Values.potassiumIntracellularConcentration = ikSlider.getValue();
                Values.chloridePermeability = pcSlider.getValue() / 10000.0;

                Values.ClExtracellularConcentration = ecSlider.getValue();
                Values.ClIntracellularConcentration = icSlider.getValue();
                Values.temperature = tSlider.getValue();

                Values.overallPotential.remove(0);
                Values.overallPotential.add(NerstEquations.membranePotential());
                Values.NaPotential.remove(0);
                Values.NaPotential.add(NerstEquations.sodiumPotential());
                Values.potassiumPotential.remove(0);
                Values.potassiumPotential.add(NerstEquations.potassiumPotential());
                Values.chloridePotential.remove(0);
                Values.chloridePotential.add(NerstEquations.chloridePotential());

        }

        private JButton newEmptyButton() {
                return new JButton("");
        }
}
