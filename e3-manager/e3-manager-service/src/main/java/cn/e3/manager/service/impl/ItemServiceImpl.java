package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.service.ItemService;
import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private TbItemMapper itemMapper;
	//根据主键查询商品数据
	public TbItem findItemByID(Long itemId){
		
		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		
		return item;
		
	}
}
