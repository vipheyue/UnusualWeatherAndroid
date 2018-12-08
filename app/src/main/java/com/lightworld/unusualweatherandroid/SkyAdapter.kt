package com.lightworld.unusualweatherandroid

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder


class SkyAdapter :
    BaseQuickAdapter<SkyBean, BaseViewHolder>(R.layout.item_sky, null) {

    override fun convert(helper: BaseViewHolder, item: SkyBean) {

        helper.setText(R.id.tv_title, item.logo)
        helper.setText(R.id.tv_des, item.data)


    }

}
