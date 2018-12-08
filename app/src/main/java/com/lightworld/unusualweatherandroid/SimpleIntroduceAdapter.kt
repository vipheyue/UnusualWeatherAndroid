package com.lightworld.unusualweatherandroid

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder


class SimpleIntroduceAdapter :
    BaseQuickAdapter<SimpleIntroduceBean, BaseViewHolder>(R.layout.item_simple_introduce, null) {

    override fun convert(helper: BaseViewHolder, item: SimpleIntroduceBean) {

        helper.setText(R.id.tv_title, item.titile)
        helper.setText(R.id.tv_des, item.des)

    }

}
