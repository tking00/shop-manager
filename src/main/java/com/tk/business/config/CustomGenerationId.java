package com.tk.business.config;

import com.tk.business.utils.IdWorker;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * 	自定义id生成
 * @author hll
 *
 */
public class CustomGenerationId implements IdentifierGenerator {
	
	/**
	 * id前缀
	 */
	private String idPrefix;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		return IdWorker.getId();
	}


}
