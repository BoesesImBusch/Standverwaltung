package interfaces;

import entities.Employee;

import java.util.Date;

public interface Validation {

    public boolean validateText(String text);
    public boolean validateZIP(String zip);
    public boolean validateStartDateBeforeEndDate(Date start, Date end);
    public boolean validateEmail(String mail);
    public boolean validateIBAN(String iban);
    public boolean validateBIC(String BIC);
    public boolean validateWorktime(Long worktimeInMin);
    public boolean validatePhone(String phone);
    public boolean validateLegalWorktime(Employee employee, double planedWorkTime);
}
