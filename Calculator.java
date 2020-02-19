/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculation;

/**
 *
 * @author virameherkar
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Variable Declaration
     */
    
    double firstnum;
    double secondnum;
    double result;
    String operations;
    
    
    public Calculator() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTxtDisplay = new javax.swing.JTextField();
        jBtn2 = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnSub = new javax.swing.JButton();
        jBtnAdd = new javax.swing.JButton();
        jBtnMul = new javax.swing.JButton();
        jBtnDiv = new javax.swing.JButton();
        jBtnDec = new javax.swing.JButton();
        jBtnNeg = new javax.swing.JButton();
        jBtnClr = new javax.swing.JButton();
        jBtnEqu = new javax.swing.JButton();
        jBtnExt = new javax.swing.JButton();
        jBtnsqu = new javax.swing.JButton();
        jBtnlog = new javax.swing.JButton();
        jBtnCos = new javax.swing.JButton();
        jBtnSqrt = new javax.swing.JButton();
        jBtnTan = new javax.swing.JButton();
        jBtnsInvert = new javax.swing.JButton();
        jBtnePow = new javax.swing.JButton();
        jBtnCub3 = new javax.swing.JButton();
        jBtnComb = new javax.swing.JButton();
        jBtnFact = new javax.swing.JButton();
        jBtnsqu2 = new javax.swing.JButton();
        jBtnCubrt = new javax.swing.JButton();
        jBtnSin = new javax.swing.JButton();
        jBtnPer = new javax.swing.JButton();
        jBtnloge = new javax.swing.JButton();
        jBtnPercent = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTxtDisplay.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDisplayActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn0.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnSub.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnSub.setText("-");
        jBtnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSubActionPerformed(evt);
            }
        });

        jBtnAdd.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnAdd.setText("+");
        jBtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddActionPerformed(evt);
            }
        });

        jBtnMul.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnMul.setText("*");
        jBtnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMulActionPerformed(evt);
            }
        });

        jBtnDiv.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnDiv.setText("/");
        jBtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivActionPerformed(evt);
            }
        });

        jBtnDec.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnDec.setText(".");
        jBtnDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDecActionPerformed(evt);
            }
        });

        jBtnNeg.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnNeg.setText("+/-");
        jBtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNegActionPerformed(evt);
            }
        });

        jBtnClr.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnClr.setText("C");
        jBtnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClrActionPerformed(evt);
            }
        });

        jBtnEqu.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnEqu.setText("=");
        jBtnEqu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEquActionPerformed(evt);
            }
        });

        jBtnExt.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnExt.setText("Exit");
        jBtnExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExtActionPerformed(evt);
            }
        });

        jBtnsqu.setFont(new java.awt.Font("Monaco", 1, 12)); // NOI18N
        jBtnsqu.setText("XpowY");
        jBtnsqu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnsquActionPerformed(evt);
            }
        });

        jBtnlog.setFont(new java.awt.Font("Monaco", 1, 12)); // NOI18N
        jBtnlog.setText("logyX");
        jBtnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnlogActionPerformed(evt);
            }
        });

        jBtnCos.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnCos.setText("cos");
        jBtnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCosActionPerformed(evt);
            }
        });

        jBtnSqrt.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jBtnSqrt.setText("sqrt");
        jBtnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSqrtActionPerformed(evt);
            }
        });

        jBtnTan.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnTan.setText("tan");
        jBtnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTanActionPerformed(evt);
            }
        });

        jBtnsInvert.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnsInvert.setText("1/X");
        jBtnsInvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnsInvertActionPerformed(evt);
            }
        });

        jBtnePow.setFont(new java.awt.Font("Monaco", 1, 12)); // NOI18N
        jBtnePow.setText("epowX");
        jBtnePow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnePowActionPerformed(evt);
            }
        });

        jBtnCub3.setFont(new java.awt.Font("Monaco", 1, 12)); // NOI18N
        jBtnCub3.setText("Xpow3");
        jBtnCub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCub3ActionPerformed(evt);
            }
        });

        jBtnComb.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnComb.setText("nCr");
        jBtnComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCombActionPerformed(evt);
            }
        });

        jBtnFact.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnFact.setText("X!");
        jBtnFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFactActionPerformed(evt);
            }
        });

        jBtnsqu2.setFont(new java.awt.Font("Monaco", 1, 12)); // NOI18N
        jBtnsqu2.setText("Xpow2");
        jBtnsqu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnsqu2ActionPerformed(evt);
            }
        });

        jBtnCubrt.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jBtnCubrt.setText("cbrt");
        jBtnCubrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCubrtActionPerformed(evt);
            }
        });

        jBtnSin.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnSin.setText("sin");
        jBtnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSinActionPerformed(evt);
            }
        });

        jBtnPer.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnPer.setText("nPr");
        jBtnPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPerActionPerformed(evt);
            }
        });

        jBtnloge.setFont(new java.awt.Font("Monaco", 1, 12)); // NOI18N
        jBtnloge.setText("logeX");
        jBtnloge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnlogeActionPerformed(evt);
            }
        });

        jBtnPercent.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jBtnPercent.setText("%");
        jBtnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPercentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTxtDisplay, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jBtnNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jBtnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jBtnClr, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jBtnExt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)
                                    .addComponent(jBtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)
                                    .addComponent(jBtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jBtnDec, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)
                                    .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)
                                    .addComponent(jBtnEqu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jBtnsInvert, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jBtnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jBtnCubrt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jBtnsqu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)
                                    .addComponent(jBtnsqu2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)
                                    .addComponent(jBtnCub3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jBtnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)
                                    .addComponent(jBtnloge, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtnePow, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, 0)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jBtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(14, 14, 14)
                                            .addComponent(jBtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(14, 14, 14)
                                            .addComponent(jBtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jBtnFact, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(14, 14, 14)
                                            .addComponent(jBtnComb, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(14, 14, 14)
                                            .addComponent(jBtnPer, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnDec, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnEqu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnsqu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnsqu2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnCub3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnePow, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnloge, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnComb, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnPer, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnFact, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnCubrt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnsInvert, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnClr, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        String Enternumber= jTxtDisplay.getText() + jBtn1.getText();
        //get.Text() --- Get the text entered in the text box or given field
        jTxtDisplay.setText(Enternumber);
        //set.Text() --- Use to print or replace ther already written string
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        String Enternumber= jTxtDisplay.getText() + jBtn2.getText();
        jTxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        String Enternumber= jTxtDisplay.getText() + jBtn3.getText();
        jTxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        String Enternumber= jTxtDisplay.getText() + jBtn4.getText();
        jTxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        String Enternumber= jTxtDisplay.getText() + jBtn5.getText();
        jTxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        String Enternumber= jTxtDisplay.getText() + jBtn6.getText();
        jTxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        String Enternumber= jTxtDisplay.getText() + jBtn7.getText();
        jTxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
       String Enternumber= jTxtDisplay.getText() + jBtn8.getText();
        jTxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        String Enternumber= jTxtDisplay.getText() + jBtn9.getText();
        jTxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        String Enternumber= jTxtDisplay.getText() + jBtn0.getText();
        jTxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExtActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnExtActionPerformed

    private void jBtnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClrActionPerformed
        jTxtDisplay.setText("");
    }//GEN-LAST:event_jBtnClrActionPerformed

    private void jBtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddActionPerformed
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "+";
    }//GEN-LAST:event_jBtnAddActionPerformed

    private void jBtnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubActionPerformed
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "-";
    }//GEN-LAST:event_jBtnSubActionPerformed

    private void jBtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivActionPerformed
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "/";
    }//GEN-LAST:event_jBtnDivActionPerformed

    private void jBtnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMulActionPerformed
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "*";
    }//GEN-LAST:event_jBtnMulActionPerformed

    private void jBtnDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDecActionPerformed
        String Enternumber= jTxtDisplay.getText() + jBtnDec.getText();
        jTxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtnDecActionPerformed

    private void jBtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNegActionPerformed
        double neg = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        neg = neg *(-1);
        jTxtDisplay.setText(String.valueOf(neg));
    }//GEN-LAST:event_jBtnNegActionPerformed

    private void jBtnEquActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEquActionPerformed
        String Answer;
        secondnum = Double.parseDouble(jTxtDisplay.getText());
        if (null != operations)
        switch (operations) {
            case "+":
                result = firstnum + secondnum;
                Answer = String.format("%.0f", result);
                jTxtDisplay.setText(Answer);
                firstnum = result;
                break;
            case "-":
                result = firstnum - secondnum;
                Answer = String.format("%.0f", result);
                jTxtDisplay.setText(Answer);
                firstnum = result;
                break;
            case "*":
                result = firstnum * secondnum;
                Answer = String.format("%.0f", result);
                jTxtDisplay.setText(Answer);
                firstnum = result;
                break;
            case "/":
                result = firstnum / secondnum;
                Answer = String.format("%.0f", result);
                jTxtDisplay.setText(Answer);
                firstnum = result;
                break;
            case "2":
                result = firstnum;
                for (int i=1;i<secondnum;i++ ){
                    result = result * firstnum;
                }   Answer = String.format("%.0f", result);
                jTxtDisplay.setText(Answer);
                firstnum = result;
                break;
            case "c":
                result =  (factorial(firstnum) / (factorial(firstnum - secondnum) * factorial(secondnum)));
                Answer = String.format("%.0f", result);
                jTxtDisplay.setText(Answer);
                firstnum = result;
                break;
            case "p":
                result =  (factorial(firstnum) / (factorial(firstnum - secondnum)));
                Answer = String.format("%.0f", result);
                jTxtDisplay.setText(Answer);
                firstnum = result;
                break;
            case "log":
                result = ( Math.log(firstnum) / Math.log(secondnum));
                jTxtDisplay.setText(String.valueOf(result));
                firstnum = result;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jBtnEquActionPerformed

    private void jBtnsquActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnsquActionPerformed
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "2";
    }//GEN-LAST:event_jBtnsquActionPerformed

    private void jBtnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnlogActionPerformed
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "log";
    }//GEN-LAST:event_jBtnlogActionPerformed

    private void jBtnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCosActionPerformed
        double val = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        val = Math.toRadians(val);
        val =Math.cos(val);
        jTxtDisplay.setText(String.valueOf(val));
        firstnum = val;
        
    }//GEN-LAST:event_jBtnCosActionPerformed

    private void jBtnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSqrtActionPerformed
        double val = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        String s ="[+/-]";
        val =Math.sqrt(val);
        jTxtDisplay.setText(s.concat(String.valueOf(val)));
    }//GEN-LAST:event_jBtnSqrtActionPerformed

    private void jBtnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTanActionPerformed
        double val = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        val = Math.toRadians(val);
        val =Math.tan(val);
        jTxtDisplay.setText(String.valueOf(val));
        firstnum = val;
    }//GEN-LAST:event_jBtnTanActionPerformed

    private void jBtnsInvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnsInvertActionPerformed
        double val = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        double ans = 1/val;
        jTxtDisplay.setText(String.valueOf(ans));
        firstnum = ans;
    }//GEN-LAST:event_jBtnsInvertActionPerformed

    private void jBtnePowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnePowActionPerformed
        firstnum = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        double val;
        val = (expo(firstnum) );
        jTxtDisplay.setText(String.valueOf(val));
        firstnum = val;
    }//GEN-LAST:event_jBtnePowActionPerformed

    private void jBtnCub3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCub3ActionPerformed
        double val = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        val = val*val*val;
        jTxtDisplay.setText(String.valueOf(val));
        firstnum = val;
    }//GEN-LAST:event_jBtnCub3ActionPerformed

    private void jBtnCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCombActionPerformed
       firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "c";
    }//GEN-LAST:event_jBtnCombActionPerformed

    private void jBtnFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFactActionPerformed
        firstnum = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        double fact=1;
        fact = (factorial(firstnum));
        jTxtDisplay.setText(String.valueOf(fact));
        firstnum = fact;
    }//GEN-LAST:event_jBtnFactActionPerformed

    private void jBtnsqu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnsqu2ActionPerformed
        double val = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        val = val*val;
        jTxtDisplay.setText(String.valueOf(val));
        firstnum = val;
    }//GEN-LAST:event_jBtnsqu2ActionPerformed

    private void jBtnCubrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCubrtActionPerformed
       double val = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        val =Math.cbrt(val);
        jTxtDisplay.setText(String.valueOf(val));
        firstnum = val;
    }//GEN-LAST:event_jBtnCubrtActionPerformed

    private void jBtnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSinActionPerformed
        firstnum = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        double val1 = Math.toRadians(firstnum);
        val1 =Math.sin(val1);
        jTxtDisplay.setText(String.valueOf(val1));
        firstnum = val1;
    }//GEN-LAST:event_jBtnSinActionPerformed

    private void jBtnPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPerActionPerformed
        firstnum = Double.parseDouble(jTxtDisplay.getText());
        jTxtDisplay.setText("");
        operations = "p";
    }//GEN-LAST:event_jBtnPerActionPerformed

    private void jBtnlogeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnlogeActionPerformed
        double val = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
        val =Math.log(val);
        jTxtDisplay.setText(String.valueOf(val));
        firstnum = val;
    }//GEN-LAST:event_jBtnlogeActionPerformed

    private void jBtnPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPercentActionPerformed
       double val = Double.parseDouble(String.valueOf(jTxtDisplay.getText()));
       val =val/100;
       jTxtDisplay.setText(String.valueOf(val));
       firstnum = val;

    }//GEN-LAST:event_jBtnPercentActionPerformed

    private void jTxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDisplayActionPerformed
    static double expo(double x) 
    { 
        // Calculate exponential of e with tylor series
        double sum = 1;  
        double i;
        for(i = 10 - 1; i > 0; --i ) 
            sum = 1 + x * sum / i; 
        return sum; 
    }
    
     public static double factorial(double n) {
        // Calculate factorial 
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnAdd;
    private javax.swing.JButton jBtnClr;
    private javax.swing.JButton jBtnComb;
    private javax.swing.JButton jBtnCos;
    private javax.swing.JButton jBtnCub3;
    private javax.swing.JButton jBtnCubrt;
    private javax.swing.JButton jBtnDec;
    private javax.swing.JButton jBtnDiv;
    private javax.swing.JButton jBtnEqu;
    private javax.swing.JButton jBtnExt;
    private javax.swing.JButton jBtnFact;
    private javax.swing.JButton jBtnMul;
    private javax.swing.JButton jBtnNeg;
    private javax.swing.JButton jBtnPer;
    private javax.swing.JButton jBtnPercent;
    private javax.swing.JButton jBtnSin;
    private javax.swing.JButton jBtnSqrt;
    private javax.swing.JButton jBtnSub;
    private javax.swing.JButton jBtnTan;
    private javax.swing.JButton jBtnePow;
    private javax.swing.JButton jBtnlog;
    private javax.swing.JButton jBtnloge;
    private javax.swing.JButton jBtnsInvert;
    private javax.swing.JButton jBtnsqu;
    private javax.swing.JButton jBtnsqu2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTxtDisplay;
    // End of variables declaration//GEN-END:variables
}
