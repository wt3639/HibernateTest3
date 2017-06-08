package com.tom.hibernate;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.spi.MetadataImplementor;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * ��hbm����ddl
 * 
 * @author liang
 * 
 */
public class ExportDB {
	public static void main(String[] args) {
		// Ĭ�϶�ȡhibernate.cfg.xml�ļ�
		//Configuration cfg = new Configuration().configure();
		//// ���ɲ����sql���ļ�����ǰĿ¼�������ݿ�
		ServiceRegistry serviceRegistry = (ServiceRegistry) new StandardServiceRegistryBuilder().configure().build();  
		MetadataImplementor metadataImplementor = (MetadataImplementor) new MetadataSources(serviceRegistry).buildMetadata();
		SchemaExport export = new SchemaExport(serviceRegistry, metadataImplementor);
		export.create(true, true);
		//SchemaExport export = new SchemaExport(cfg);
		//export.create(true, true);
	}
}