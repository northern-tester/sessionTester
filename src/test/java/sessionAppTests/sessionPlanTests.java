package sessionAppTests;

import readExcelInput.sessionPlan;
import junit.framework.Assert;
import org.junit.Test;

public class sessionPlanTests{

private sessionPlan sessions;

@Test
public void createSessionPlanObjectTest(){
    sessions = new sessionPlan("C:/", "Filename.xls");
}

@Test
public void getPathTest(){
  String path = sessions.getPlanLocation();
  Assert.assertEquals("Assert Can Get Path", "C:/", path);
}

@Test
public void getFileNameTest(){
  String name = sessions.getPlanFileName();
  Assert.assertEquals("Assert can get name","Filename.xls", name);
}

}