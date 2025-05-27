package main.java.com.examly.springapploan.model;

import java.time.LocalDateTime;
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
public class LoanDisbursement {

    private long  loanDisbursementId;
    private LocalDateTime  disbursementDate;
    private double disbursementAmount;
    private String disbursementMethod;
    private String status;
    private String remarks;
    private LoanApplication loanApplication;

}
