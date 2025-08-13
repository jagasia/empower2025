package com.empower.demo;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({MathematicsTest1.class, MathematicsTest3.class, MathematicsTest2.class})
@IncludeCategory({Admin.class, User.class})
public class MyTestSuite {

}
