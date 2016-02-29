package com.bmbs.wechat.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bmbs.wechat.constants.WeChatConstants;

public class FileUtil {
	
	private static Logger log = LoggerFactory.getLogger(FileUtil.class);

	public static String readFile(String fileName){
		StringBuffer rtnValue = new StringBuffer();
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),WeChatConstants.UTF8));
			String line = "";
			while((line = bufferedReader.readLine()) != null){
				rtnValue.append(line.trim());
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			log.error(e.getMessage());
		} catch (IOException e) {
			log.error(e.getMessage());
		}
		
		return rtnValue.toString();
	}
	
}
