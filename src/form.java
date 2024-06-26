package quizeapplication;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class form extends javax.swing.JFrame {
    private ButtonGroup buttonGroup;
    private int currentQuestionIndex;
    private int score;
    private Quiz quiz;
    private List<Integer> bookmarkedQuestions;
    /**
     * Creates new form form
     */
    public form() {
        initComponents();
        showMarks.setVisible(false);
        ShowBookMarks.setVisible(false);
        jLabel2.setVisible(false);
//        BookMaked.setVisible(false);
//        marks.setVisible(false);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(Option1);
        buttonGroup.add(Option2);
        buttonGroup.add(Option3);
        buttonGroup.add(Option4);
        currentQuestionIndex = 0;
        score = 0;
        bookmarkedQuestions = new ArrayList<>();
        quiz = new Quiz();
        quiz.addQuestion(new Question("What is the capital city of France?", new String[]{"Paris", "Rome", "London", "Berlin"}, 0));
        quiz.addQuestion(new Question("What is the largest planet in our solar system?", new String[]{"Mars", "Earth", "Jupiter", "Venus"}, 2));
        quiz.addQuestion(new Question("Who wrote 'Romeo and Juliet ?", new String[]{"William Shakespeare", "Charles Dickens", "Jane Austen", "Mark Twain"}, 0));
        quiz.addQuestion(new Question("What is the capital city of Rwanda ?", new String[]{"Nyabugogo", "Rubavu", "Kibungo", "None Above"}, 3));
        quiz.addQuestion(new Question("How many College Does Rwanda Polytechnic have ?", new String[]{"7", "8", "3", "None Above"}, 1));
        quiz.addQuestion(new Question("How do we decrare the variable in Java ?", new String[]{"datatype VariableName;", "VariableName(Datatype)", "VariableName.parseInt()", "None Above"}, 0));
        quiz.addQuestion(new Question("which mysqli function used to connect database ?", new String[]{"mysqli_query;", "mysqli_connection()", "mysqli_connect();", "None Above"}, 2));
        quiz.addQuestion(new Question("Is Rwanda a landlocked country ?", new String[]{"Yes it is", "No it is not", "both Landlocked and none landlocked", "None Above"}, 0));
        quiz.addQuestion(new Question("How Many Sectors that are in Rwanda ?", new String[]{"417", "417", "416", "415"}, 2));
        quiz.addQuestion(new Question("How Many District that are in Rwanda ?", new String[]{"29", "30", "31", "32"},1));
        displayQuestion(currentQuestionIndex);
    }
    
    private void displayQuestion(int index) {
        Question question = quiz.getQuestions().get(index);
        jLabel1.setText("Question " + (index + 1) + ": " + question.getText());
        String[] options = question.getOptions();
        Option1.setText(options[0]);
        Option2.setText(options[1]);
        Option3.setText(options[2]);
        Option4.setText(options[3]);
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuestionPanel = new javax.swing.JPanel();
        Bookmark = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        Option1 = new javax.swing.JRadioButton();
        Option2 = new javax.swing.JRadioButton();
        Option3 = new javax.swing.JRadioButton();
        Option4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        congsPanel = new javax.swing.JPanel();
        showMarks = new javax.swing.JButton();
        ShowBookMarks = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QuestionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bookmark.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bookmark.setText("Bookmark");
        Bookmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookmarkActionPerformed(evt);
            }
        });
        QuestionPanel.add(Bookmark, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 240, 60));

        Next.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        QuestionPanel.add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 250, 60));

        Option1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Option1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        QuestionPanel.add(Option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 370, 60));

        Option2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Option2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option2ActionPerformed(evt);
            }
        });
        QuestionPanel.add(Option2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 370, 60));

        Option3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Option3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option3ActionPerformed(evt);
            }
        });
        QuestionPanel.add(Option3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 500, 60));

        Option4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Option4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Option4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option4ActionPerformed(evt);
            }
        });
        QuestionPanel.add(Option4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 370, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Questions ");
        QuestionPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1440, 60));

        congsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showMarks.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        showMarks.setText("Show Results");
        showMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMarksActionPerformed(evt);
            }
        });
        congsPanel.add(showMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 280, 60));

        ShowBookMarks.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ShowBookMarks.setText("ShowBookMarked");
        ShowBookMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowBookMarksActionPerformed(evt);
            }
        });
        congsPanel.add(ShowBookMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 260, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Congrates");
        congsPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 620, 120));

        QuestionPanel.add(congsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 1250, 230));

        getContentPane().add(QuestionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1430, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Option3ActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
// Get the selected option
    int selectedOptionIndex = -1;
    if (Option1.isSelected()) {
        selectedOptionIndex = 0;
    } else if (Option2.isSelected()) {
        selectedOptionIndex = 1;
    } else if (Option3.isSelected()) {
        selectedOptionIndex = 2;
    } else if (Option4.isSelected()) {
        selectedOptionIndex = 3;
    }
    
    if (selectedOptionIndex == quiz.getQuestions().get(currentQuestionIndex).getCorrectAnswerIndex()) {
        score++;
    }
    currentQuestionIndex++;
    if (currentQuestionIndex < quiz.getQuestions().size()) {
        displayQuestion(currentQuestionIndex);
    } else {
        Next.setVisible(false);
        showMarks.setVisible(false);
        Bookmark.setVisible(false);
        ShowBookMarks.setVisible(true);
        showMarks.setVisible(true);
        jLabel2.setVisible(true);
        showMarks.removeActionListener(showMarks.getActionListeners()[0]);
        showMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMarksActionPerformed(evt);
            }
        });
        jLabel1.setVisible(false);
    jLabel2.setText("Congratulations! You have completed the quiz.");
        Option1.setVisible(false); // Hide the option buttons
        Option2.setVisible(false);
        Option3.setVisible(false);
        Option4.setVisible(false);
        Bookmark.setVisible(false); // Hide the Bookmark button
    }
    
    buttonGroup.clearSelection();
    }//GEN-LAST:event_NextActionPerformed

    private void Option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Option2ActionPerformed

    private void Option4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Option4ActionPerformed

    private void showMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMarksActionPerformed
       String message = "Your score: " + score + "/" + quiz.getQuestions().size();
       JOptionPane.showMessageDialog(this, message);
//    marks.setText(message);
    }//GEN-LAST:event_showMarksActionPerformed

    private void BookmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookmarkActionPerformed
        bookmarkedQuestions.add(currentQuestionIndex);
        JOptionPane.showMessageDialog(this, "Question bookmarked!");
    }//GEN-LAST:event_BookmarkActionPerformed

    private void ShowBookMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowBookMarksActionPerformed
        String message = "Bookmarked Questions:\n";
    for (int questionIndex : bookmarkedQuestions) {
        message += "Question " + (questionIndex + 1) + ": " + quiz.getQuestions().get(questionIndex).getText() + "\n";
    }
    JOptionPane.showMessageDialog(this, message);
//        BookMaked.setText(message);
         
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowBookMarksActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bookmark;
    private javax.swing.JButton Next;
    private javax.swing.JRadioButton Option1;
    private javax.swing.JRadioButton Option2;
    private javax.swing.JRadioButton Option3;
    private javax.swing.JRadioButton Option4;
    private javax.swing.JPanel QuestionPanel;
    private javax.swing.JButton ShowBookMarks;
    private javax.swing.JPanel congsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton showMarks;
    // End of variables declaration//GEN-END:variables
}
