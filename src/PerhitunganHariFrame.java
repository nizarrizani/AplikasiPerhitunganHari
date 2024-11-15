
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class PerhitunganHariFrame extends javax.swing.JFrame {

    /**
     * Creates new form PerhitunganHariFrame
     */
    public PerhitunganHariFrame() {
        initComponents();

        // Populating ComboBox with Month Names
        String[] months = new String[]{
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        cbbBulan.setModel(new DefaultComboBoxModel<>(months));

        // Set initial year range in spinner
        spTahun.setModel(new javax.swing.SpinnerNumberModel(2024, 1900, 2100, 1));

        // Set default values (current month and year)
        Calendar currentDate = Calendar.getInstance();
        int currentMonth = currentDate.get(Calendar.MONTH);  // Get current month (0-11)
        int currentYear = currentDate.get(Calendar.YEAR);    // Get current year

        // Set the combo box and spinner to the current month and year
        cbbBulan.setSelectedIndex(currentMonth);
        spTahun.setValue(currentYear);

        // Sync calendar when the user changes the month or year
        jCalendar1.getMonthChooser().addPropertyChangeListener("month", evt -> updateComboBox());
        jCalendar1.getYearChooser().addPropertyChangeListener("year", evt -> updateComboBox());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cbbBulan = new javax.swing.JComboBox<>();
        spTahun = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnHitung = new javax.swing.JButton();
        btnHitungSelisih = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblHari = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblKabisat = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPertama = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTerakhir = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Perhitungan Hari");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        cbbBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbBulan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbBulanItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(cbbBulan, gridBagConstraints);

        spTahun.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spTahunStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(spTahun, gridBagConstraints);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bulan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tahun");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(jCalendar1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(jCalendar2, gridBagConstraints);

        jLabel6.setText("Calendar Selisih");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel6, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        jPanel2.setLayout(new java.awt.GridLayout(5, 2, 6, 4));

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        jPanel2.add(btnHitung);

        btnHitungSelisih.setText("Hitung Selisih");
        btnHitungSelisih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungSelisihActionPerformed(evt);
            }
        });
        jPanel2.add(btnHitungSelisih);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Jumlah Hari :");
        jPanel2.add(jLabel3);
        jPanel2.add(lblHari);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Tahun Kabisat :");
        jPanel2.add(jLabel5);
        jPanel2.add(lblKabisat);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Hari Pertama :");
        jPanel2.add(jLabel4);
        jPanel2.add(lblPertama);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Hari Terakhir :");
        jPanel2.add(jLabel7);
        jPanel2.add(lblTerakhir);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbBulanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbBulanItemStateChanged
        updateCalendar();
    }//GEN-LAST:event_cbbBulanItemStateChanged

    private void spTahunStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spTahunStateChanged
        updateCalendar();
    }//GEN-LAST:event_spTahunStateChanged

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        updateHasil();
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnHitungSelisihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungSelisihActionPerformed
        calculateDateDifference();
    }//GEN-LAST:event_btnHitungSelisihActionPerformed

    // Method to update calendar based on combo box and spinner selection
    private void updateCalendar() {
        int selectedMonth = cbbBulan.getSelectedIndex();  // Get selected month index
        int selectedYear = (Integer) spTahun.getValue();  // Get selected year

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, selectedYear);
        calendar.set(Calendar.MONTH, selectedMonth);

        // Set the calendar to the new date
        jCalendar1.setDate(calendar.getTime());
    }

    // Method to update the combo box and spinner based on the calendar date
    private void updateComboBox() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(jCalendar1.getDate());

        int month = calendar.get(Calendar.MONTH);  // Get month index from calendar
        int year = calendar.get(Calendar.YEAR);   // Get year from calendar

        cbbBulan.setSelectedIndex(month);  // Set the selected month in the combo box
        spTahun.setValue(year);            // Set the selected year in the spinner
    }

    private void updateHasil() {
        // Get the current date from the JCalendar component
        LocalDate selectedDate = jCalendar1.getDate().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        // Get the number of days in the selected month and year using LocalDate
        int numberOfDays = selectedDate.lengthOfMonth();   // This will give the number of days in the month

        // Update lblHari label with the number of days in the selected month
        lblHari.setText(String.valueOf(numberOfDays));

        // Check if the selected year is a leap year using LocalDate
        boolean isLeapYear = selectedDate.isLeapYear();

        // Update lblKabisat label with TRUE/FALSE based on leap year status
        lblKabisat.setText(isLeapYear ? "TRUE" : "FALSE");

        // Get the first day of the selected month (always the 1st of the month)
        LocalDate firstDay = selectedDate.withDayOfMonth(1);
        // Get the last day of the selected month
        LocalDate lastDay = selectedDate.withDayOfMonth(numberOfDays);

        // Get the day of the week for the first and last day
        String firstDayOfWeek = firstDay.getDayOfWeek().toString(); // Get the day of the week
        String lastDayOfWeek = lastDay.getDayOfWeek().toString();   // Get the day of the week

        // Convert to a more readable format (first letter uppercase, rest lowercase)
        firstDayOfWeek = firstDayOfWeek.substring(0, 1).toUpperCase() + firstDayOfWeek.substring(1).toLowerCase();
        lastDayOfWeek = lastDayOfWeek.substring(0, 1).toUpperCase() + lastDayOfWeek.substring(1).toLowerCase();

        // Update lblPertama with the day of the week and the date for the first day
        lblPertama.setText(firstDayOfWeek + ", " + firstDay.toString());  // Format: "Monday, 2024-02-01"

        // Update lblTerakhir with the day of the week and the date for the last day
        lblTerakhir.setText(lastDayOfWeek + ", " + lastDay.toString());   // Format: "Tuesday, 2024-02-29"
    }

    private void calculateDateDifference() {
        // Get the selected dates from both JCalendar components and convert them to LocalDate
        LocalDate date1 = jCalendar1.getDate().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        LocalDate date2 = jCalendar2.getDate().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        // Calculate the difference between the two dates
        long daysBetween = java.time.temporal.ChronoUnit.DAYS.between(date1, date2);

        // Prepare the message to display, including the dates and the difference
        String message = "You are comparing the following dates:\n"
                + "Date 1: " + date1.toString() + " (" + date1.getDayOfWeek() + ")\n"
                + "Date 2: " + date2.toString() + " (" + date2.getDayOfWeek() + ")\n\n"
                + "The difference between the two dates is: " + Math.abs(daysBetween) + " days.";

        // Show the message in a JOptionPane dialog
        JOptionPane.showMessageDialog(this, message, "Date Difference", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(PerhitunganHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHariFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerhitunganHariFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnHitungSelisih;
    private javax.swing.JComboBox<String> cbbBulan;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblHari;
    private javax.swing.JLabel lblKabisat;
    private javax.swing.JLabel lblPertama;
    private javax.swing.JLabel lblTerakhir;
    private javax.swing.JSpinner spTahun;
    // End of variables declaration//GEN-END:variables
}
