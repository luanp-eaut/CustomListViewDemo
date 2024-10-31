package eaut.it.mobileappdev.customlistviewdemo;

import java.util.Arrays;
import java.util.List;

public  class CompanyData {
    public static List<Company> getCompanies(){
        Company[] result = new Company[]{
                new Company(R.drawable.download_1,"Twitter","Twitter company"),
                new Company(R.drawable.download_2,"Facebook","Facebook company"),
                new Company(R.drawable.download_3,"Apple","Apple company"),
                new Company(R.drawable.download_4,"Google","Google company"),
                new Company(R.drawable.download_5,"Microsoft","Microsoft company")
        };
        return Arrays.asList(result);
    }
}
