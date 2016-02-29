package com.bmbs.sale.common;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:configs/Context.xml",
		"classpath*:configs/Service.xml", "classpath*:configs/DAO.xml" })
public class CommonSpringContext extends AbstractJUnit4SpringContextTests {

}