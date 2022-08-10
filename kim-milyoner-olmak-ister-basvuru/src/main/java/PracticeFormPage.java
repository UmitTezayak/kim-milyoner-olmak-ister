import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;
import java.util.concurrent.TimeUnit;


public class PracticeFormPage {

    private WebDriver driver;
    private final By tcKimlikLocator = By.xpath("//input[@id='MilyonerForm_TCNo']");
    private final By isimSoyisimLocator = By.id("MilyonerForm_NameSurname");
    private final By yasanilanSehiLocator = By.id("MilyonerForm_LivingCity");
    private final By dogumYeriLocator = By.xpath("//input[@id='MilyonerForm_BornCity']");
    private final By dogumTarihiLocator = By.xpath("//input[@id='MilyonerForm_BirthDate']");
    private final By resimYuklemeLocator = By.xpath("//input[@id='file']");
    private final By cinsiyetSecimErkekLocator = By.xpath("//html/body/div[@id='body-content']/div/div/div[3]/div/form/table/tbody/tr[7]/td/label[1]/em");
    private final By cinsiyetSecimKadinLocator = By.xpath("//html/body/div[@id='body-content']/div/div/div[3]/div/form/table/tbody/tr[7]/td/label[2]/em");
    private final By mobilePrefixLocator = By.id("MilyonerForm_MobilePrefix");
    private final By mobileFirstLocator = By.id("MilyonerForm_MobileFirst");
    private final By mobileSecondLocator = By.id("MilyonerForm_MobileSecond");
    private final By mobileLastLocator = By.id("MilyonerForm_MobileLast");
    private final By phonePrefixLocator = By.id("MilyonerForm_PhonePrefix");
    private final By phoneFirstLocator = By.id("MilyonerForm_PhoneFirst");
    private final By phoneSecondLocator = By.id("MilyonerForm_PhoneSecond");
    private final By phoneLastLocator = By.id("MilyonerForm_PhoneLast");
    private final By emailLocator = By.id("MilyonerForm_Email");
    private final By educationSchoolLocator = By.id("MilyonerForm_EducationSchoolName");
    private final By yurtDisiLocator1 = By.xpath("//html/body/div[@id='body-content']/div/div/div[3]/div/form/table/tbody/tr[11]/td/label[1]/em");
    private final By yurtDisiLocator2 = By.xpath("//html/body/div[@id='body-content']/div/div/div[3]/div/form/table/tbody/tr[12]/td/label[1]/em");
    private final By currentEducationSchoolLocator = By.id("MilyonerForm_EducationCurrentSchoolName");
    private final By currentEducationDepartmentLocator = By.id("MilyonerForm_EducationCurrentDepartment");
    private final By jobLocator = By.id("MilyonerForm_Job");
    private final By companyNameLocator = By.id("MilyonerForm_CompanyName");
    private final By companyWorkTitleLocator = By.id("MilyonerForm_WorkTitle");
    private final By marriedLocator = By.id("MilyonerForm_Married");
    private final By hobbiesLocator = By.id("MilyonerForm_Hobbies");
    private final By talentYesLocator = By.xpath("//html/body/div[@id='body-content']/div/div/div[3]/div/form/table/tbody/tr[19]/td/label[1]/em");
    private final By talentNoLocator = By.xpath("//html/body/div[@id='body-content']/div/div/div[3]/div/form/table/tbody/tr[19]/td/label[2]/em");
    private final By milyonerInterviewYesLocator = By.xpath("//html/body/div[@id='body-content']/div/div/div[3]/div/form/table/tbody/tr[20]/td/label[1]/em");
    private final By milyonerInterviewNoLocator = By.xpath("//html/body/div[@id='body-content']/div/div/div[3]/div/form/table/tbody/tr[20]/td/label[2]/em");
    private final By joinProgramYesLocator = By.xpath("//html/body/div[@id='body-content']/div/div/div[3]/div/form/table/tbody/tr[21]/td/label[1]/em");
    private final By joinProgramNoLocator = By.xpath("//html/body/div[@id='body-content']/div/div/div[3]/div/form/table/tbody/tr[21]/td/label[2]/em");
    private final By whatDoLocator = By.id("MilyonerForm_WhatDo");
    private final By infoLocator = By.id("MilyonerForm_Info");
    private final By languageLocator = By.id("MilyonerForm_Languages");
    private final By visitCountryLocator = By.id("MilyonerForm_VisitCountryCity");
    private final By booksLocator = By.id("MilyonerForm_Writers");
    private final By moviesLocator = By.id("MilyonerForm_MostMoviesBooks");
    private final By musicsLocator = By.id("MilyonerForm_KindOfMusic");
    private final By healthProblemYesLocator = By.xpath("//html/body/div[@id='body-content']/div/div/div[3]/div/form/table/tbody/tr[30]/td/label[1]/em");
    private final By healthProblemNoLocator = By.xpath("//html/body/div[@id='body-content']/div/div/div[3]/div/form/table/tbody/tr[30]/td/label[2]/em");
    private final By assentYesLocator = By.xpath("//html/body/div[@id='body-content']/div/div/div[3]/div/form/table/tbody/tr[32]/td/label[1]/em");
    private final By assentNoLocator = By.xpath("//html/body/div[@id='body-content']/div/div/div[3]/div/form/table/tbody/tr[32]/td/label[2]/em");
    private final By personalDataLocator = By.xpath("//html/body/div[@id='body-content']/div/div/div[3]/div/form/table/tbody/tr[33]//em");
    private final By reCaptLocator = By.xpath("//div[@class='recaptcha-checkbox-border']");


    public PracticeFormPage (WebDriver driver) {
        this.driver = driver;
    }


    public void setPicture(){
        WebElement uploadPicture = driver.findElement(resimYuklemeLocator);
        uploadPicture.sendKeys("C:\\resmim.jpg");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }



    public void setIdentification(String tcKimlik)
    {
        WebElement kimlikAlani = driver.findElement(tcKimlikLocator); //kimlik alanındaki web elementine 'kimlikAlani' isimlendirmesini yaptım.Sonrasında driver.findelement diyerek kimlik no alanının elementini buldurdum.
        kimlikAlani.click();
        kimlikAlani.sendKeys(tcKimlik);
    }
    public String getName(){
        WebElement nameSpace = driver.findElement(tcKimlikLocator);
        return nameSpace.getAttribute("value");
    }



    public void setNameSurname(String isimSoyisim)
    {
        WebElement isimAlani = driver.findElement(isimSoyisimLocator);
        isimAlani.click();
        isimAlani.sendKeys(isimSoyisim);

    }

    public void setHomeCity(String sehir)
    {
        WebElement sehirAlani = driver.findElement(yasanilanSehiLocator);
        sehirAlani.click();
        sehirAlani.sendKeys(sehir);
    }
    public void setBornCity(String dogumYeri)
    {
        WebElement dogumYeriAlani = driver.findElement(dogumYeriLocator);
        dogumYeriAlani.click();
        dogumYeriAlani.sendKeys(dogumYeri);

    }
    public void setBornDate(String dogumTarihi)
    {
        WebElement dogumTarihiAlani = driver.findElement(dogumTarihiLocator);
        dogumTarihiAlani.click();
        dogumTarihiAlani.sendKeys(dogumTarihi);
        WebElement dogumTarihiTamamButon = driver.findElement(By.xpath("//button[@class='ui-datepicker-close ui-state-default ui-priority-primary ui-corner-all']"));
        dogumTarihiTamamButon.click();
    }
    public void setGender()
    {
        WebElement cinsiyet = driver.findElement(cinsiyetSecimErkekLocator);
        cinsiyet.click();
    }
    public void setPrefixMobile(String prefixMobile)
    {
        WebElement mobilePrefixAlani = driver.findElement(mobilePrefixLocator);
        mobilePrefixAlani.click();
        mobilePrefixAlani.sendKeys(prefixMobile);
    }
    public void setFirstMobile(String firstMobile)
    {
        WebElement mobileFirstAlani = driver.findElement(mobileFirstLocator);
        mobileFirstAlani.click();
        mobileFirstAlani.sendKeys(firstMobile);
    }
    public void setSecondMobile(String secondMobile)
    {
        WebElement mobileSecondAlani = driver.findElement(mobileSecondLocator);
        mobileSecondAlani.click();
        mobileSecondAlani.sendKeys(secondMobile);
    }
    public void setLastMobile(String lastMobile)
    {
        WebElement mobileLastAlani = driver.findElement(mobileLastLocator);
        mobileLastAlani.click();
        mobileLastAlani.sendKeys(lastMobile);
    }


    public void setPrefixPhone(String prefixPhone)
    {
        WebElement phonePrefixAlani = driver.findElement(phonePrefixLocator);
        phonePrefixAlani.click();
        phonePrefixAlani.sendKeys(prefixPhone);
    }
    public void setFirstPhone(String firstPhone)
    {
        WebElement phoneFirstAlani = driver.findElement(phoneFirstLocator);
        phoneFirstAlani.click();
        phoneFirstAlani.sendKeys(firstPhone);
    }
    public void setSecondPhone(String secondPhone)
    {
        WebElement phoneSecondAlani = driver.findElement(phoneSecondLocator);
        phoneSecondAlani.click();
        phoneSecondAlani.sendKeys(secondPhone);
    }
    public void setLastPhone(String lastPhone)
    {
        WebElement phoneLastAlani = driver.findElement(phoneLastLocator);
        phoneLastAlani.click();
        phoneLastAlani.sendKeys(lastPhone);
    }
    public void setEmail(String email)
    {
        WebElement emailAlani = driver.findElement(emailLocator);
        emailAlani.click();
        emailAlani.sendKeys(email);
    }
    public void setEducation(String education)
    {
        WebElement educationAlani = driver.findElement(educationSchoolLocator);
        educationAlani.click();
        educationAlani.sendKeys(education);
    }
    public void setYurtdisi1(String yurtdisi1)
    {
        WebElement yurtDisi1Alani = driver.findElement(yurtDisiLocator1);
        yurtDisi1Alani.click();
    }
    public void setCurrentEducation(String currentEducation)
    {
        WebElement currentEducationAlani = driver.findElement(currentEducationSchoolLocator);
        currentEducationAlani.click();
        currentEducationAlani.sendKeys(currentEducation);
    }
    public void setYurtDisi2(String yurtDisi2)
    {
        WebElement yurtDisi2Alani = driver.findElement(yurtDisiLocator2);
        yurtDisi2Alani.click();
    }
    public void setCurrentEducationDepartment(String currentEducationDepartment)
    {
        WebElement educationDepartmentAlani = driver.findElement(currentEducationDepartmentLocator);
        educationDepartmentAlani.click();
        educationDepartmentAlani.sendKeys(currentEducationDepartment);
    }
    public void setJob(String job)
    {
        WebElement jobAlani= driver.findElement(jobLocator);
        jobAlani.click();
        jobAlani.sendKeys(job);
    }
    public void setCompanyName(String companyName)
    {
        WebElement companyNameAlani = driver.findElement(companyNameLocator);
        companyNameAlani.click();
        companyNameAlani.sendKeys(companyName);
    }
    public void setCompanyWorkTitle(String companyWorkTitle)
    {
        WebElement companyWorkTitleAlani = driver.findElement(companyWorkTitleLocator);
        companyWorkTitleAlani.click();
        companyWorkTitleAlani.sendKeys(companyWorkTitle);
    }
    public void setMarried(String married)
    {
        WebElement marriedAlani = driver.findElement(marriedLocator);
        marriedAlani.click();
        marriedAlani.sendKeys(married);
    }
    public void setHobbies(String hobbies)
    {
        WebElement hobbiesAlani = driver.findElement(hobbiesLocator);
        hobbiesAlani.click();
        hobbiesAlani.sendKeys(hobbies);
    }
    public void setTalentYes()
    {
        WebElement talentYesAlani = driver.findElement(talentYesLocator);
        talentYesAlani.click();
    }
   /* public void setTalentNo(String talentNo)
    {
        WebElement talentNoAlani = driver.findElement(talentNoLocator);
        talentNoAlani.click();
    }

    public void setMilyonerInterviewYes(String milyonerInterviewYes)
    {
        WebElement milyonerInterviewYesAlani = driver.findElement(milyonerInterviewYesLocator);
        milyonerInterviewYesAlani.click();
    }
    */
    public void setMilyonerInterviewNo()
    {
        WebElement milyonerInterviewNoAlani = driver.findElement(milyonerInterviewNoLocator);
        milyonerInterviewNoAlani.click();
    }
    /*public void setJoinProgramYes()
    {
        WebElement joinProgramYesAlani = driver.findElement(joinProgramYesLocator);
        joinProgramYesAlani.click();
    }

     */
    public void setJoinProgramNo()
    {
        WebElement joinProgramNoAlani = driver.findElement(joinProgramNoLocator);
        joinProgramNoAlani.click();
    }
    public void setWhatDo(String whatDo)
    {
        WebElement whatDoAlani = driver.findElement(whatDoLocator);
        whatDoAlani.click();
        whatDoAlani.sendKeys(whatDo);
    }
    public void setInfo(String info)
    {
        WebElement infoAlani = driver.findElement(infoLocator);
        infoAlani.click();
        infoAlani.sendKeys(info);
    }
    public void setLanguage(String language)
    {
        WebElement languageAlani = driver.findElement(languageLocator);
        languageAlani.click();
        languageAlani.sendKeys(language);
    }
    public void setVisitCountry(String visitCountry)
    {
        WebElement visitCountryAlani = driver.findElement(visitCountryLocator);
        visitCountryAlani.click();
        visitCountryAlani.sendKeys(visitCountry);
    }
    public void setBooks(String books)
    {
        WebElement booksAlani = driver.findElement(booksLocator);
        booksAlani.click();
        booksAlani.sendKeys(books);
    }
    public void setMovies(String movies)
    {
        WebElement moviesAlani = driver.findElement(moviesLocator);
        moviesAlani.click();
        moviesAlani.sendKeys(movies);
    }
    public void setMusics(String musics)
    {
        WebElement musicsAlani = driver.findElement(musicsLocator);
        musicsAlani.click();
        musicsAlani.sendKeys(musics);
    }
    /*public void setHealthProblemYes(String healthProblemYes)
    {
        WebElement healthProblemYesAlani = driver.findElement(healthProblemYesLocator);
        healthProblemYesAlani.click();
    }

     */
    public void setHealthProblemNo()
    {
        WebElement healthProblemNoAlani = driver.findElement(healthProblemNoLocator);
        healthProblemNoAlani.click();
    }
    public void setAssentYes()
    {
        WebElement assentYesAlani = driver.findElement(assentYesLocator);
        assentYesAlani.click();
    }
    /*
    public void setAssentNo(String assentNo)
    {
        WebElement assentNoAlani = driver.findElement(assentNoLocator);
        assentNoAlani.click();
    }

     */
    public void setPersonalData()
    {
        WebElement personalDataAlani = driver.findElement(personalDataLocator);
        personalDataAlani.click();
    }
    public void setReCapt()
    {
        WebElement reCaptAlani = driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
        reCaptAlani.sendKeys(Keys.TAB + " ");
        driver.switchTo().window(driver.getWindowHandle());
    }
    public void setGonder()
    {
        WebElement gonderAlani = driver.findElement(By.xpath("//input[@id='btnSend']"));
        gonderAlani.click();
    }


}
