import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PersonalInformationTest extends BaseTest{


    @Test
    public void setPicture() throws InterruptedException  {
        System.out.println("Resim yükleniyor");
        practiceFormPage.setPicture();
        System.out.println("Resim yüklendi");
        Thread.sleep(1000);
        setIdentification();
    }

    public void setIdentification() throws InterruptedException
    {
        practiceFormPage.setIdentification("44466688833");
        Thread.sleep(1000);
        Assertions.assertEquals("44466688833", practiceFormPage.getName(), "Tc Kimlik No hatalı !");
        setNameSurname();
    }

    public void setNameSurname() throws InterruptedException
    {
        System.out.println("test2");
        practiceFormPage.setNameSurname("Ümit Tezayak");
        Thread.sleep(1000);
        setHomeCity();
    }

    public void setHomeCity() throws InterruptedException
    {
        System.out.println("city");
        practiceFormPage.setHomeCity("İstanbul");
        Thread.sleep(1000);
        setBornCity();
    }

    public void setBornCity() throws InterruptedException
    {
        System.out.println("Born City");
        practiceFormPage.setBornCity("Antalya");
        Thread.sleep(1000);
        setBornDate();
    }

    public void setBornDate() throws InterruptedException
    {
        System.out.println("Born City");
        practiceFormPage.setBornDate("17-01-1996");
        Thread.sleep(1000);
        setGender();
    }

    public void setGender() throws InterruptedException {
        practiceFormPage.setGender();
        System.out.println("Cinsiyet secildi");
        Thread.sleep(1000);
        setPrefixMobile();
    }


    public void setPrefixMobile() throws InterruptedException {
        practiceFormPage.setPrefixMobile("555");
        Thread.sleep(1000);
        setFirstMobile();
    }
    public void setFirstMobile() throws InterruptedException {
        practiceFormPage.setFirstMobile("555");
        Thread.sleep(1000);
        setSecondMobile();
    }
    public void setSecondMobile() throws InterruptedException {
        practiceFormPage.setSecondMobile("55");
        Thread.sleep(1000);
        setLastMobile();
    }
    public void setLastMobile() throws InterruptedException {
        practiceFormPage.setLastMobile("55");
        Thread.sleep(3000);
        setPrefixPhone();
    }



    public void setPrefixPhone() throws InterruptedException {
        practiceFormPage.setPrefixPhone("555");
        Thread.sleep(1000);
        setFirstPhone();
    }
    public void setFirstPhone() throws InterruptedException {
        practiceFormPage.setFirstPhone("555");
        Thread.sleep(1000);
        setSecondPhone();
    }
    public void setSecondPhone() throws InterruptedException {
        practiceFormPage.setSecondPhone("55");
        Thread.sleep(1000);
        setLastPhone();
    }
    public void setLastPhone() throws InterruptedException {
        practiceFormPage.setLastPhone("55");
        Thread.sleep(1000);
        setEmail ();
    }
    public void setEmail () throws InterruptedException {
        practiceFormPage.setEmail("umit.tezayak@gmail.com");
        Thread.sleep(1000);
        setEducation ();
    }


    public void setEducation () throws InterruptedException
    {
        practiceFormPage.setEducation("Beykent Üniversitesi");
        Thread.sleep(1000);
        setJob();
    }
    public void setJob() throws InterruptedException
    {
        practiceFormPage.setJob("Çalışıyor");
        Thread.sleep(1000);
        setCompanyName();
    }
    public void setCompanyName() throws InterruptedException
    {
        practiceFormPage.setCompanyName("Testinium");
        Thread.sleep(1000);
        setCompanyWorkTitle();
    }
    public void setCompanyWorkTitle() throws InterruptedException
    {
        practiceFormPage.setCompanyWorkTitle("Qa Engineer");
        Thread.sleep(1000);
        setMarried();
    }
    public void setMarried() throws InterruptedException
    {
        practiceFormPage.setMarried("Evli");
        Thread.sleep(1000);
        setHobbies();
    }
    public void setHobbies() throws InterruptedException
    {
        practiceFormPage.setHobbies("Gitar çalmak, kitap okumak, yüzmek, tarihi alanları gezmek, ormanda yürüyüş yapmak");
        Thread.sleep(1000);
        setTalentYes();
    }
    public void setTalentYes() throws InterruptedException
    {
        practiceFormPage.setTalentYes();
        Thread.sleep(1000);
        setMilyonerInterviewNo();
    }
    public void setMilyonerInterviewNo() throws InterruptedException
    {
        practiceFormPage.setMilyonerInterviewNo();
        Thread.sleep(1000);
        setJoinProgramNo();
    }
    public void setJoinProgramNo() throws InterruptedException
    {
        practiceFormPage.setJoinProgramNo();
        Thread.sleep(1000);
        setWhatDo();
    }
    public void setWhatDo() throws InterruptedException
    {
        practiceFormPage.setWhatDo("Ev almak ve yurtdışı seyahati");
        Thread.sleep(1000);
        setInfo();
    }
    public void setInfo() throws InterruptedException
    {
        practiceFormPage.setInfo("Zorluk diye bir şey yoktur, iradeyi kontrol vardır.");
        Thread.sleep(1000);
        setLanguage();
    }
    public void setLanguage() throws InterruptedException
    {
        practiceFormPage.setLanguage("İngilizce");
        Thread.sleep(1000);
        setVisitCountry();
    }
    public void setVisitCountry() throws InterruptedException
    {
        practiceFormPage.setVisitCountry("Henüz görmedim ama görmek isterim");
        Thread.sleep(1000);
        setBooks();
    }
    public void setBooks() throws InterruptedException
    {
        practiceFormPage.setBooks("Suç ve Ceza, Martin Eden, Ezilenler");
        Thread.sleep(1000);
        setMovies();
    }
    public void setMovies() throws InterruptedException
    {
        practiceFormPage.setMovies("Lotr, God Father, Warcraft");
        Thread.sleep(1000);
        setMusics();
    }
    public void setMusics() throws InterruptedException
    {
        practiceFormPage.setMusics("Blues, Rock ve Deephouse");
        Thread.sleep(1000);
        setHealthProblemNo();
    }
    public void setHealthProblemNo() throws InterruptedException
    {
        practiceFormPage.setHealthProblemNo();
        Thread.sleep(1000);
        setAssentYes();
    }
    public void setAssentYes() throws InterruptedException
    {
        practiceFormPage.setAssentYes();
        Thread.sleep(1000);
        setPersonalData();
    }
    public void setPersonalData() throws InterruptedException
    {
        practiceFormPage.setPersonalData();
        Thread.sleep(1000);
        setReCapt();
    }
    public void setReCapt() throws InterruptedException
    {
        Thread.sleep(2000);
        practiceFormPage.setReCapt();
        Thread.sleep(1000);

    }
    public void setGonder(){
        practiceFormPage.setGonder();
    }


}

