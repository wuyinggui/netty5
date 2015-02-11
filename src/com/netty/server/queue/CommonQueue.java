package com.netty.server.queue;

import com.netty.server.entity.MsgEntity;

/**
 * 通用消息处理queue
 * */
public class CommonQueue extends BaseQueue<MsgEntity> {
	// private BaseQueue<MsgEntity> baseQueue = new BaseQueue<MsgEntity>();
	private static final CommonQueue INSTANCE = new CommonQueue();

	private CommonQueue() {
	}

	public static CommonQueue getInstance() {
		return INSTANCE;
	}

	// public void putMsg(MsgEntity msg) {
	// put(msg);
	// }

}
