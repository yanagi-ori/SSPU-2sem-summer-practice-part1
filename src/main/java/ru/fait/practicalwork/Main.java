package ru.fait.practicalwork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

/**
 * @author Богатырев Иван
 */
public class Main extends javax.swing.JFrame {

    final static String[] strEmpColNames = {"Код сотрудника", "ФИО", "Возраст", "Пол", "Адрес", "Телефон", "Паспортные данные", "Код должности"};
    final static String[] strPosColNames = {"Код должности", "Наименование должности", "Оклад", "Обязанности", "Требования"};
    final static String[] strGoodsColNames = {"Код товара", "Код типа", "Производитель", "Наименование", "Условия хранения", "Упаковка", "Срок годности"};
    final static String[] strTOGColNames = {"Код типа", "Наименование", "Описание", "Особенности"};
    final static String[] strSupColNames = {"Код поставщика", "Наименование", "Адрес", "Телефон", "Код поставляемого товара 1", "Код поставляемого товара2", "Код поставляемого товара 3"};
    final static String[] strCosColNames = {"Код заказчика", "Наименование", "Адрес", "Телефон", "Код потребляемого товара 1", "Код потребляемого товара2", "Код потребляемого товара 3"};
    final static String[] strStockColNames = {"Дата поступления", "Дата заказа", "Дата отпраки", "Код товара", "Код поставщика", "Код заказчика", "Способ доставки", "Объем", "Цена", "Код сотрудника"};
    Vector<String> colNames;
    Vector<String> empColNames;
    Vector<String> posColNames;
    Vector<String> goodsColNames;
    Vector<String> togColNames;
    Vector<String> supColNames;
    Vector<String> custColNames;
    Vector<String> stockColNames;
    File empPath;
    File posPath;
    File goodsPath;
    File togPath;
    File supPath;
    File cusPath;
    File stockPath;
    int rowIndex;

    /**
     * Creates new form MainActivity
     */
    public Main() {
        setTitle("БД оптового склада");
        initComponents();

        empColNames = new Vector<String>(Arrays.asList(strEmpColNames));
        DefaultTableModel employeesModel = new DefaultTableModel(empColNames, 0);
        employeesTable.setModel(employeesModel);

        posColNames = new Vector<String>(Arrays.asList(strPosColNames));
        DefaultTableModel positionsModel = new DefaultTableModel(posColNames, 0);
        positionsTable.setModel(positionsModel);

        goodsColNames = new Vector<String>(Arrays.asList(strGoodsColNames));
        DefaultTableModel goodsModel = new DefaultTableModel(goodsColNames, 0);
        goodsTable.setModel(goodsModel);

        togColNames = new Vector<String>(Arrays.asList(strTOGColNames));
        DefaultTableModel togModel = new DefaultTableModel(togColNames, 0);
        togTable.setModel(togModel);

        supColNames = new Vector<String>(Arrays.asList(strSupColNames));
        DefaultTableModel suppliersModel = new DefaultTableModel(supColNames, 0);
        suppliersTable.setModel(suppliersModel);

        custColNames = new Vector<String>(Arrays.asList(strCosColNames));
        DefaultTableModel costumersModel = new DefaultTableModel(custColNames, 0);
        customersTable.setModel(costumersModel);

        stockColNames = new Vector<String>(Arrays.asList(strStockColNames));
        DefaultTableModel stockModel = new DefaultTableModel(stockColNames, 0);
        stockTable.setModel(stockModel);

        if (new File("employees.txt").exists()) {
            empPath = new File("employees.txt");
            fillTable(empPath, empColNames, employeesTable);
        }
        if (new File("positions.txt").exists()) {
            posPath = new File("positions.txt");
            fillTable(posPath, posColNames, positionsTable);
        }
        if (new File("goods.txt").exists()) {
            goodsPath = new File("goods.txt");
            fillTable(goodsPath, goodsColNames, goodsTable);
        }
        if (new File("types_of_goods.txt").exists()) {
            togPath = new File("types_of_goods.txt");
            fillTable(togPath, togColNames, togTable);
        }
        if (new File("suppliers.txt").exists()) {
            supPath = new File("suppliers.txt");
            fillTable(supPath, supColNames, suppliersTable);
        }
        if (new File("customers.txt").exists()) {
            cusPath = new File("customers.txt");
            fillTable(cusPath, custColNames, customersTable);
        }
        if (new File("stock.txt").exists()) {
            stockPath = new File("stock.txt");
            fillTable(stockPath, stockColNames, stockTable);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        Tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        empAddButton = new javax.swing.JButton();
        empEditButton = new javax.swing.JButton();
        empDeleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeesTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        posAddButton = new javax.swing.JButton();
        posEditButton = new javax.swing.JButton();
        posDeleteButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        positionsTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        goodsAddButton = new javax.swing.JButton();
        goodsEditButton = new javax.swing.JButton();
        goodsDeleteButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        goodsTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        togTable = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        togAddButton = new javax.swing.JButton();
        togEditButton = new javax.swing.JButton();
        togDeleteButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        suppliersTable = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        supAddButton = new javax.swing.JButton();
        supEditButton = new javax.swing.JButton();
        supDeleteButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        customersTable = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        custAddButton = new javax.swing.JButton();
        custEditButton = new javax.swing.JButton();
        custDeleteButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        stockAddButton = new javax.swing.JButton();
        stockEditButton = new javax.swing.JButton();
        stockDeleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openEmployeesTableMenuItem = new javax.swing.JMenuItem();
        openPositionsMenuItem = new javax.swing.JMenuItem();
        openGoodsTableMenuItem = new javax.swing.JMenuItem();
        openTOGMenuItem = new javax.swing.JMenuItem();
        openSuppliersMenuItem = new javax.swing.JMenuItem();
        openCustomersTableItem = new javax.swing.JMenuItem();
        openStockMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        hrdMenuRequest = new javax.swing.JMenuItem();
        goodsListMenuRequest = new javax.swing.JMenuItem();
        supListMenuItem4 = new javax.swing.JMenuItem();
        custListMenuRequest = new javax.swing.JMenuItem();
        ordersMenuRequest = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem5.setText("jMenuItem5");

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Редактирование");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Таблицы");

        empAddButton.setText("Добавить");
        empAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empAddButtonActionPerformed(evt);
            }
        });

        empEditButton.setText("Редактировать");
        empEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empEditButtonActionPerformed(evt);
            }
        });

        empDeleteButton.setText("Удалить");
        empDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(empAddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empEditButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empDeleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        employeesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Код сотрудника", "ФИО", "Возраст", "Пол", "Адрес", "Телефон", "Паспортные данные", "Код должности"
            }
        ));
        employeesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeesTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tabs.addTab("Сотрудники", jPanel1);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Редактирование");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Таблицы");

        posAddButton.setText("Добавить");
        posAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posAddButtonActionPerformed(evt);
            }
        });

        posEditButton.setText("Редактировать");
        posEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posEditButtonActionPerformed(evt);
            }
        });

        posDeleteButton.setText("Удалить");
        posDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(posAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(posDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(posEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel8)
                .addGap(1, 1, 1)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(posAddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(posEditButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(posDeleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        positionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Код должности", "Наименование должности", "Оклад", "Обязанности", "Требования"
            }
        ));
        positionsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                positionsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(positionsTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        Tabs.addTab("Должности", jPanel2);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Редактирование");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Таблицы");

        goodsAddButton.setText("Добавить");
        goodsAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodsAddButtonActionPerformed(evt);
            }
        });

        goodsEditButton.setText("Редактировать");
        goodsEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodsEditButtonActionPerformed(evt);
            }
        });

        goodsDeleteButton.setText("Удалить");
        goodsDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodsDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goodsAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goodsDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goodsEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(goodsAddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goodsEditButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goodsDeleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        goodsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Код товара", "Код типа", "Производитель", "Наименование", "Условия хранения", "Упаковка", "Срок годности"
            }
        ));
        goodsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goodsTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(goodsTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        Tabs.addTab("Товары", jPanel3);

        togTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Код типа", "Наименование", "Описание", "Особенности"
            }
        ));
        togTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                togTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(togTable);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Редактирование");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Таблицы");

        togAddButton.setText("Добавить");
        togAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togAddButtonActionPerformed(evt);
            }
        });

        togEditButton.setText("Редактировать");
        togEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togEditButtonActionPerformed(evt);
            }
        });

        togDeleteButton.setText("Удалить");
        togDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(togAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(togDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(togEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel18)
                .addGap(1, 1, 1)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(togAddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(togEditButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(togDeleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tabs.addTab("Типы товаров", jPanel4);

        suppliersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Код поставщика", "Наименование", "Адрес", "Телефон", "Код поставляемого товара 1", "Код поставляемого товара 2", "Код поставляемого товара 3"
            }
        ));
        suppliersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppliersTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(suppliersTable);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Редактирование");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Таблицы");

        supAddButton.setText("Добавить");
        supAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supAddButtonActionPerformed(evt);
            }
        });

        supEditButton.setText("Редактировать");
        supEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supEditButtonActionPerformed(evt);
            }
        });

        supDeleteButton.setText("Удалить");
        supDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel20)
                .addGap(1, 1, 1)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(supAddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supEditButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supDeleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tabs.addTab("Поставщики", jPanel5);

        customersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Код заказчика", "Наименование", "Адрес", "Телефон", "Код потребляемого товара 1", "Код потребляемого товара 2", "Код потребляемого товара 3"
            }
        ));
        customersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(customersTable);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Редактирование");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Таблицы");

        custAddButton.setText("Добавить");
        custAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custAddButtonActionPerformed(evt);
            }
        });

        custEditButton.setText("Редактировать");
        custEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custEditButtonActionPerformed(evt);
            }
        });

        custDeleteButton.setText("Удалить");
        custDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(custAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(custDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(custEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel22)
                .addGap(1, 1, 1)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(custAddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(custEditButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(custDeleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tabs.addTab("Заказчики", jPanel6);

        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Дата поступления", "Дата заказа", "Дата отпраки", "Код товара", "Код поставщика", "Код заказчика", "Способ доставки", "Объем", "Цена", "Код сотрудника"
            }
        ));
        stockTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(stockTable);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Редактирование");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Таблицы");

        stockAddButton.setText("Добавить");
        stockAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockAddButtonActionPerformed(evt);
            }
        });

        stockEditButton.setText("Редактировать");
        stockEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockEditButtonActionPerformed(evt);
            }
        });

        stockDeleteButton.setText("Удалить");
        stockDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stockAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stockDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stockEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel24)
                .addGap(1, 1, 1)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stockAddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stockEditButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stockDeleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tabs.addTab("Склад", jPanel7);

        jLabel1.setText("jLabel1");

        jMenu1.setText("Файл");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        openEmployeesTableMenuItem.setText("Открыть таблицу сотрудников");
        openEmployeesTableMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openEmployeesTableMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(openEmployeesTableMenuItem);

        openPositionsMenuItem.setText("Открыть таблицу должностей");
        openPositionsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openPositionsMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(openPositionsMenuItem);

        openGoodsTableMenuItem.setText("Открыть таблицу товаров");
        openGoodsTableMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openGoodsTableMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(openGoodsTableMenuItem);

        openTOGMenuItem.setText("Открыть таблицу типов товаров");
        openTOGMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openTOGMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(openTOGMenuItem);

        openSuppliersMenuItem.setText("Открыть таблицу поставщиков");
        openSuppliersMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openSuppliersMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(openSuppliersMenuItem);

        openCustomersTableItem.setText("Открыть таблицу заказчиков");
        openCustomersTableItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openCustomersTableItemActionPerformed(evt);
            }
        });
        jMenu1.add(openCustomersTableItem);

        openStockMenuItem.setText("Отркыть таблицу склада");
        openStockMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openStockMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(openStockMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Запрос");

        hrdMenuRequest.setText("Отдел Кадров");
        hrdMenuRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrdMenuRequestActionPerformed(evt);
            }
        });
        jMenu2.add(hrdMenuRequest);

        goodsListMenuRequest.setText("Список товаров");
        goodsListMenuRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodsListMenuRequestActionPerformed(evt);
            }
        });
        jMenu2.add(goodsListMenuRequest);

        supListMenuItem4.setText("Список поставщиков");
        supListMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supListMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(supListMenuItem4);

        custListMenuRequest.setText("Список заказчиков");
        custListMenuRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custListMenuRequestActionPerformed(evt);
            }
        });
        jMenu2.add(custListMenuRequest);

        ordersMenuRequest.setText("Заказы");
        ordersMenuRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersMenuRequestActionPerformed(evt);
            }
        });
        jMenu2.add(ordersMenuRequest);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabs)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openCustomersTableItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openCustomersTableItemActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        class MyTxtFilter extends FileFilter {

            @Override
            public boolean accept(File file) {
                return file.isDirectory()
                        || file.getAbsolutePath().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return "Текстовые файлы (*.txt)";
            }
        }
        fc.setFileFilter(new MyTxtFilter());
        if (fc.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        cusPath = fc.getSelectedFile();
        fillTable(cusPath, custColNames, customersTable);
    }//GEN-LAST:event_openCustomersTableItemActionPerformed

    private void openEmployeesTableMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openEmployeesTableMenuItemActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        class MyTxtFilter extends FileFilter {

            @Override
            public boolean accept(File file) {
                return file.isDirectory()
                        || file.getAbsolutePath().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return "Текстовые файлы (*.txt)";
            }
        }
        fc.setFileFilter(new MyTxtFilter());
        if (fc.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File empPath = fc.getSelectedFile();
        fillTable(empPath, empColNames, employeesTable);
    }//GEN-LAST:event_openEmployeesTableMenuItemActionPerformed

    private void openStockMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openStockMenuItemActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        class MyTxtFilter extends FileFilter {

            @Override
            public boolean accept(File file) {
                return file.isDirectory()
                        || file.getAbsolutePath().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return "Текстовые файлы (*.txt)";
            }
        }
        fc.setFileFilter(new MyTxtFilter());
        if (fc.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        stockPath = fc.getSelectedFile();
        fillTable(stockPath, stockColNames, stockTable);
    }//GEN-LAST:event_openStockMenuItemActionPerformed

    private void openGoodsTableMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openGoodsTableMenuItemActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        class MyTxtFilter extends FileFilter {

            @Override
            public boolean accept(File file) {
                return file.isDirectory()
                        || file.getAbsolutePath().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return "Текстовые файлы (*.txt)";
            }
        }
        fc.setFileFilter(new MyTxtFilter());
        if (fc.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        goodsPath = fc.getSelectedFile();
        fillTable(goodsPath, goodsColNames, goodsTable);
    }//GEN-LAST:event_openGoodsTableMenuItemActionPerformed

    private void hrdMenuRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrdMenuRequestActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm1 = (DefaultTableModel) employeesTable.getModel();
        DefaultTableModel tm2 = (DefaultTableModel) positionsTable.getModel();
        HrdRequestDialog rd = new HrdRequestDialog(this, true, tm1.getDataVector(), tm2.getDataVector());
        rd.setVisible(true);

    }//GEN-LAST:event_hrdMenuRequestActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void openPositionsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openPositionsMenuItemActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        class MyTxtFilter extends FileFilter {

            @Override
            public boolean accept(File file) {
                return file.isDirectory()
                        || file.getAbsolutePath().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return "Текстовые файлы (*.txt)";
            }
        }
        fc.setFileFilter(new MyTxtFilter());
        if (fc.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        posPath = fc.getSelectedFile();
        fillTable(posPath, posColNames, positionsTable);
    }//GEN-LAST:event_openPositionsMenuItemActionPerformed

    private void openSuppliersMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openSuppliersMenuItemActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        class MyTxtFilter extends FileFilter {

            @Override
            public boolean accept(File file) {
                return file.isDirectory()
                        || file.getAbsolutePath().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return "Текстовые файлы (*.txt)";
            }
        }
        fc.setFileFilter(new MyTxtFilter());
        if (fc.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        supPath = fc.getSelectedFile();
        fillTable(supPath, supColNames, suppliersTable);
    }//GEN-LAST:event_openSuppliersMenuItemActionPerformed

    private void openTOGMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openTOGMenuItemActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        class MyTxtFilter extends FileFilter {

            @Override
            public boolean accept(File file) {
                return file.isDirectory()
                        || file.getAbsolutePath().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return "Текстовые файлы (*.txt)";
            }
        }
        fc.setFileFilter(new MyTxtFilter());
        if (fc.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        togPath = fc.getSelectedFile();
        fillTable(togPath, togColNames, togTable);
    }//GEN-LAST:event_openTOGMenuItemActionPerformed

    private void supListMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supListMenuItem4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm1 = (DefaultTableModel) suppliersTable.getModel();
        DefaultTableModel tm2 = (DefaultTableModel) goodsTable.getModel();
        SupRequestDialog rd = new SupRequestDialog(this, true, tm1.getDataVector(), tm2.getDataVector());
        rd.setVisible(true);
    }//GEN-LAST:event_supListMenuItem4ActionPerformed

    private void custListMenuRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custListMenuRequestActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm1 = (DefaultTableModel) customersTable.getModel();
        DefaultTableModel tm2 = (DefaultTableModel) goodsTable.getModel();
        CustRequestDialog rd = new CustRequestDialog(this, true, tm1.getDataVector(), tm2.getDataVector());
        rd.setVisible(true);
    }//GEN-LAST:event_custListMenuRequestActionPerformed

    private void ordersMenuRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersMenuRequestActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm1 = (DefaultTableModel) stockTable.getModel();
        DefaultTableModel tm2 = (DefaultTableModel) goodsTable.getModel();
        DefaultTableModel tm3 = (DefaultTableModel) suppliersTable.getModel();
        DefaultTableModel tm4 = (DefaultTableModel) customersTable.getModel();
        DefaultTableModel tm5 = (DefaultTableModel) employeesTable.getModel();

        OrdersRequestDialog rd = new OrdersRequestDialog(this, true, tm1.getDataVector(),
                tm2.getDataVector(), tm3.getDataVector(), tm4.getDataVector(), tm5.getDataVector());
        rd.setVisible(true);
    }//GEN-LAST:event_ordersMenuRequestActionPerformed

    private void goodsListMenuRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodsListMenuRequestActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm1 = (DefaultTableModel) goodsTable.getModel();
        DefaultTableModel tm2 = (DefaultTableModel) togTable.getModel();
        GoodsRequestDialog rd = new GoodsRequestDialog(this, true, tm1.getDataVector(), tm2.getDataVector());
        rd.setVisible(true);
    }//GEN-LAST:event_goodsListMenuRequestActionPerformed

    private void goodsEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodsEditButtonActionPerformed
        // TODO add your handling code here:
        if (rowIndex != -1) {
            GoodsOperationDialog ed = new GoodsOperationDialog(this, true);
            ed.setVisible(true);
            if (!ed.get().isEmpty()) {
                insert(goodsPath, ed.get(), rowIndex);
                fillTable(goodsPath, goodsColNames, goodsTable);
            }
        }
        rowIndex = -1;
    }//GEN-LAST:event_goodsEditButtonActionPerformed

    private void goodsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodsAddButtonActionPerformed
        // TODO add your handling code here:
        GoodsOperationDialog ad = new GoodsOperationDialog(this, true);
        ad.setVisible(true);
        add(goodsPath, ad.get());
        fillTable(goodsPath, goodsColNames, goodsTable);
    }//GEN-LAST:event_goodsAddButtonActionPerformed

    private void posEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posEditButtonActionPerformed
        // TODO add your handling code here:
        if (rowIndex != -1) {
            PosOperationDialog ed = new PosOperationDialog(this, true);
            ed.setVisible(true);
            if (!ed.get().isEmpty()) {
                insert(posPath, ed.get(), rowIndex);
                fillTable(posPath, posColNames, positionsTable);
            }
        }
        rowIndex = -1;
    }//GEN-LAST:event_posEditButtonActionPerformed

    private void posAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posAddButtonActionPerformed
        // TODO add your handling code here:
        PosOperationDialog ad = new PosOperationDialog(this, true);
        ad.setVisible(true);
        add(posPath, ad.get());
        fillTable(posPath, posColNames, positionsTable);
    }//GEN-LAST:event_posAddButtonActionPerformed

    private void empEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empEditButtonActionPerformed
        // TODO add your handling code here:
        if (rowIndex != -1) {
            EmpOperationDialog ed = new EmpOperationDialog(this, true, (Vector) dtm.getDataVector().get(rowIndex));
            ed.setVisible(true);
            if (!ed.get().isEmpty()) {
                insert(empPath, ed.get(), rowIndex);
                fillTable(empPath, empColNames, employeesTable);
            }
        }
        rowIndex = -1;
    }//GEN-LAST:event_empEditButtonActionPerformed

    private void empAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empAddButtonActionPerformed
        // TODO add your handling code here:
        EmpOperationDialog ad = new EmpOperationDialog(this, true, vector);
        ad.setVisible(true);
        add(empPath, ad.get());
        fillTable(empPath, empColNames, employeesTable);
    }//GEN-LAST:event_empAddButtonActionPerformed

    private void togAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togAddButtonActionPerformed
        // TODO add your handling code here:
        TogOperationDialog ad = new TogOperationDialog(this, true);
        ad.setVisible(true);
        add(togPath, ad.get());
        fillTable(togPath, togColNames, togTable);
    }//GEN-LAST:event_togAddButtonActionPerformed

    private void togEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togEditButtonActionPerformed
        // TODO add your handling code here:
        if (rowIndex != -1) {
            TogOperationDialog ed = new TogOperationDialog(this, true);
            ed.setVisible(true);
            if (!ed.get().isEmpty()) {
                insert(togPath, ed.get(), rowIndex);
                fillTable(togPath, togColNames, togTable);
            }
        }
        rowIndex = -1;
    }//GEN-LAST:event_togEditButtonActionPerformed

    private void supAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supAddButtonActionPerformed
        SupOperationDialog ad = new SupOperationDialog(this, true);
        ad.setVisible(true);
        add(supPath, ad.get());
        fillTable(supPath, supColNames, suppliersTable);
    }//GEN-LAST:event_supAddButtonActionPerformed

    private void supEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supEditButtonActionPerformed
        if (rowIndex != -1) {
            StockOperationDialog ed = new StockOperationDialog(this, true);
            ed.setVisible(true);
            if (!ed.get().isEmpty()) {
                insert(supPath, ed.get(), rowIndex);
                fillTable(supPath, supColNames, suppliersTable);
            }
        }
        rowIndex = -1;
    }//GEN-LAST:event_supEditButtonActionPerformed

    private void custAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custAddButtonActionPerformed
        CustOperationDialog ad = new CustOperationDialog(this, true, new Vector());
        ad.setVisible(true);
        add(cusPath, ad.get());
        fillTable(cusPath, custColNames, customersTable);
    }//GEN-LAST:event_custAddButtonActionPerformed

    private void custEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custEditButtonActionPerformed
        if (rowIndex != -1) {
            CustOperationDialog ed = new CustOperationDialog(this, true, dtm.getDataVector());
            ed.setVisible(true);
            if (!ed.get().isEmpty()) {
                insert(cusPath, ed.get(), rowIndex);
                fillTable(cusPath, custColNames, customersTable);
            }
        }
        rowIndex = -1;
    }//GEN-LAST:event_custEditButtonActionPerformed

    private void stockAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockAddButtonActionPerformed
        StockOperationDialog ad = new StockOperationDialog(this, true);
        ad.setVisible(true);
        add(stockPath, ad.get());
        fillTable(stockPath, stockColNames, stockTable);
    }//GEN-LAST:event_stockAddButtonActionPerformed

    private void stockEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockEditButtonActionPerformed
        if (rowIndex != -1) {
            StockOperationDialog ed = new StockOperationDialog(this, true);
            ed.setVisible(true);
            if (!ed.get().isEmpty()) {
                insert(stockPath, ed.get(), rowIndex);
                fillTable(stockPath, stockColNames, stockTable);
            }
        }
        rowIndex = -1;
    }//GEN-LAST:event_stockEditButtonActionPerformed

    private void empDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empDeleteButtonActionPerformed
        if (rowIndex != -1) {
            delete(empPath, rowIndex);
            fillTable(empPath, empColNames, employeesTable);
        }
        rowIndex = -1;
    }//GEN-LAST:event_empDeleteButtonActionPerformed

    private void stockTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockTableMouseClicked
        rowIndex = stockTable.getSelectedRow();
    }//GEN-LAST:event_stockTableMouseClicked

    private void employeesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeesTableMouseClicked
        rowIndex = employeesTable.getSelectedRow();
    }//GEN-LAST:event_employeesTableMouseClicked

    private void positionsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_positionsTableMouseClicked
        rowIndex = positionsTable.getSelectedRow();
    }//GEN-LAST:event_positionsTableMouseClicked

    private void goodsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goodsTableMouseClicked
        rowIndex = goodsTable.getSelectedRow();
    }//GEN-LAST:event_goodsTableMouseClicked

    private void togTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_togTableMouseClicked
        rowIndex = togTable.getSelectedRow();
    }//GEN-LAST:event_togTableMouseClicked

    private void suppliersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppliersTableMouseClicked
        rowIndex = suppliersTable.getSelectedRow();
    }//GEN-LAST:event_suppliersTableMouseClicked

    private void customersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersTableMouseClicked
        rowIndex = customersTable.getSelectedRow();
    }//GEN-LAST:event_customersTableMouseClicked

    private void posDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posDeleteButtonActionPerformed
        if (rowIndex != -1) {
            delete(posPath, rowIndex);
            fillTable(posPath, posColNames, positionsTable);
        }
        rowIndex = -1;
    }//GEN-LAST:event_posDeleteButtonActionPerformed

    private void goodsDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodsDeleteButtonActionPerformed
        if (rowIndex != -1) {
            delete(goodsPath, rowIndex);
            fillTable(goodsPath, goodsColNames, goodsTable);
        }
        rowIndex = -1;
    }//GEN-LAST:event_goodsDeleteButtonActionPerformed

    private void togDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togDeleteButtonActionPerformed
        if (rowIndex != -1) {
            delete(togPath, rowIndex);
            fillTable(togPath, togColNames, togTable);
        }
        rowIndex = -1;
    }//GEN-LAST:event_togDeleteButtonActionPerformed

    private void supDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supDeleteButtonActionPerformed
        if (rowIndex != -1) {
            delete(supPath, rowIndex);
            fillTable(supPath, supColNames, suppliersTable);
        }
        rowIndex = -1;
    }//GEN-LAST:event_supDeleteButtonActionPerformed

    private void custDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custDeleteButtonActionPerformed
        if (rowIndex != -1) {
            delete(cusPath, rowIndex);
            fillTable(cusPath, custColNames, customersTable);
        }
        rowIndex = -1;
    }//GEN-LAST:event_custDeleteButtonActionPerformed

    private void stockDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockDeleteButtonActionPerformed
        if (rowIndex != -1) {
            delete(stockPath, rowIndex);
            fillTable(stockPath, stockColNames, stockTable);
        }
        rowIndex = -1;
    }//GEN-LAST:event_stockDeleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void fillTable(File f, Vector<String> thisColNames, javax.swing.JTable table) {
        InputStreamReader ir = null;
        BufferedReader br = null;
        try {
            ir = new InputStreamReader(new FileInputStream(f), "UTF8");
            br = new BufferedReader(ir);
            String buf;
            Vector data = new Vector();
            Vector row;
            while ((buf = br.readLine()) != null) {
                if (buf.equals("")) {
                    continue;
                }
                String[] sa = buf.split(";");
                row = new Vector();
                for (int i = 0; i < thisColNames.size(); i++) {
                    row.add(sa[i]);
                }
                data.add(row);
                table.setModel(new DefaultTableModel(data, thisColNames));
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }

    public void add(File path, Vector addition) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path, true), StandardCharsets.UTF_8))) {
            bw.write("\n");
            bw.write(String.join(";", addition));
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insert(File path, Vector newLine, int rowIndex) {
        Scanner sc;
        int counter = 0;
        StringBuilder newFile = new StringBuilder();
        try {
            sc = new Scanner(path, "UTF-8");
            while (sc.hasNextLine()) {
                System.out.println(counter);
                if (counter == rowIndex) {
                    newFile.append(String.join(";", newLine));
                    if (sc.hasNextLine()) {
                        System.out.println(sc.nextLine());
                    }
                } else {
                    newFile.append(sc.nextLine());

                }
                newFile.append("\n");
                counter++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path, false), StandardCharsets.UTF_8))) {
            bw.write(newFile.toString());
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(File path, int rowIndex) {
        Scanner sc;
        int counter = 0;
        StringBuilder newFile = new StringBuilder();
        try {
            sc = new Scanner(path, "UTF-8");
            while (sc.hasNextLine()) {
                System.out.println(counter);
                if (counter == rowIndex) {
                    if (sc.hasNextLine()) {
                        System.out.println(sc.nextLine());
                    }
                } else {
                    newFile.append(sc.nextLine());
                    newFile.append("\n");
                }
                counter++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path, false), StandardCharsets.UTF_8))) {
            bw.write(newFile.toString());
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JButton custAddButton;
    private javax.swing.JButton custDeleteButton;
    private javax.swing.JButton custEditButton;
    private javax.swing.JMenuItem custListMenuRequest;
    public javax.swing.JTable customersTable;
    private javax.swing.JButton empAddButton;
    private javax.swing.JButton empDeleteButton;
    private javax.swing.JButton empEditButton;
    public javax.swing.JTable employeesTable;
    private javax.swing.JButton goodsAddButton;
    private javax.swing.JButton goodsDeleteButton;
    private javax.swing.JButton goodsEditButton;
    private javax.swing.JMenuItem goodsListMenuRequest;
    public javax.swing.JTable goodsTable;
    private javax.swing.JMenuItem hrdMenuRequest;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JMenuItem openCustomersTableItem;
    private javax.swing.JMenuItem openEmployeesTableMenuItem;
    private javax.swing.JMenuItem openGoodsTableMenuItem;
    private javax.swing.JMenuItem openPositionsMenuItem;
    private javax.swing.JMenuItem openStockMenuItem;
    private javax.swing.JMenuItem openSuppliersMenuItem;
    private javax.swing.JMenuItem openTOGMenuItem;
    private javax.swing.JMenuItem ordersMenuRequest;
    private javax.swing.JButton posAddButton;
    private javax.swing.JButton posDeleteButton;
    private javax.swing.JButton posEditButton;
    public javax.swing.JTable positionsTable;
    private javax.swing.JButton stockAddButton;
    private javax.swing.JButton stockDeleteButton;
    private javax.swing.JButton stockEditButton;
    public javax.swing.JTable stockTable;
    private javax.swing.JButton supAddButton;
    private javax.swing.JButton supDeleteButton;
    private javax.swing.JButton supEditButton;
    private javax.swing.JMenuItem supListMenuItem4;
    public javax.swing.JTable suppliersTable;
    private javax.swing.JButton togAddButton;
    private javax.swing.JButton togDeleteButton;
    private javax.swing.JButton togEditButton;
    public javax.swing.JTable togTable;
    // End of variables declaration//GEN-END:variables
}
