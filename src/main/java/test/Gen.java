package test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 *
 * @版权: Copyright (c) 2016-2017 ****公司技术开发部
 * @author :Steven Liu
 * @E-mail:1661105301@qq.com
 * @版本: 1.0
 * @创建日期: 2017年12月22日 下午8:29:58
 * @ClassName Gen
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */
public class Gen {

	public static void main(String[] args) throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = Resources.getResourceAsFile("generatorConfig.xml");// maven加载
		// File configFile = new File("generatorConfig.xml"); //普通java程序
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
	}
}
