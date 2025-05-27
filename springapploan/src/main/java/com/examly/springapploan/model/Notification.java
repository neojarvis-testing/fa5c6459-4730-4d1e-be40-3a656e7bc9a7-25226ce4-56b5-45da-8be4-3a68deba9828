package main.java.com.examly.springapploan.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notification {

    private long notificationId;
    private String message;
    private boolean isRead;
    private LocalDateTime createdAt;
    private User user;
    private Loan loan;
    private LoanApplication loanApplication;
    private LoanDisbursement loanDisbursement;

}
