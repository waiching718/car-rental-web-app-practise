package com.mercury.finalserver.dao;

import com.mercury.finalserver.bean.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreDao extends JpaRepository<Store,Long> {
}
