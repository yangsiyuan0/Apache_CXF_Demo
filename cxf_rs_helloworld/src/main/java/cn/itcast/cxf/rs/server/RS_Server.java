package cn.itcast.cxf.rs.server;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import cn.itcast.cxf.domain.Car;
import cn.itcast.cxf.domain.User;
import cn.itcast.cxf.service.IUserService;
import cn.itcast.cxf.service.UserServiceImpl;

public class RS_Server {
	public static void main(String[] args) {
		// ����ҵ��ӿ� ʵ�������
		IUserService userService = new UserServiceImpl();
		// ������FactoryBean ��������
		JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
		jaxrsServerFactoryBean.setResourceClasses(User.class, Car.class); // ����Щʵ������ת��xml��json����
		jaxrsServerFactoryBean.setServiceBean(userService);
		jaxrsServerFactoryBean.setAddress("http://localhost:9997");

		// ��������
		jaxrsServerFactoryBean.create();
	}
}
