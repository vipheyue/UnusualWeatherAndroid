package com.lightworld.unusualweatherandroid

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.IFillFormatter
import com.github.mikephil.charting.utils.ColorTemplate
import com.google.gson.Gson
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_main.*
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException
import java.util.*


/**
 * A placeholder fragment containing a simple view.
 */
class MainActivityFragment : Fragment() {
    val client = OkHttpClient()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        getNetData("https://api.caiyunapp.com/v2/Kg47BflU7B5pPOGN/121.6544,25.1552/forecast.json")
        getNetData("https://api.caiyunapp.com/v2/Kg47BflU7B5pPOGN/111.613221,22.086306/forecast.json")

        initData()
        chart_rain_2h.invalidate()




        initDataWeather()
        setDataWeather(5, 30f)
        rainAndWeatherChart.invalidate()

    }

    @Throws(IOException::class)
    private fun getNetData(url: String): Unit {


        val request = Request.Builder()
            .url(url)
            .build()
        Observable.create<Response> {
            val response = client.newCall(request).execute()
            it.onNext(response)
        }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<Response>{
                override fun onComplete() {
                }

                override fun onSubscribe(d: Disposable) {
                }

                override fun onNext(response: Response) {
                   var result=response.body()!!.string()
                    var bean = Gson().fromJson(result, WeatherBean::class.java)
                    set2hData(bean)

                }

                override fun onError(e: Throwable) {
                    e.printStackTrace()
                }
            })
//        println(result)
//        return result
    }

    private fun initDataWeather() {
//        rainAndWeatherChart.setViewPortOffsets(0f, 0f, 0f, 0f)
        rainAndWeatherChart.setBackgroundColor(Color.rgb(104, 241, 175))
// no description text
        rainAndWeatherChart.description.isEnabled = false

        // enable touch gestures
        rainAndWeatherChart.setTouchEnabled(false)

        rainAndWeatherChart.dragDecelerationFrictionCoef = 0.9f

        // enable scaling and dragging
        rainAndWeatherChart.isDragEnabled = true
        rainAndWeatherChart.setScaleEnabled(true)
        rainAndWeatherChart.setDrawGridBackground(false)
        rainAndWeatherChart.isHighlightPerDragEnabled = true

        rainAndWeatherChart.setPinchZoom(false)

        rainAndWeatherChart.animateX(1500)

        // get the legend (only possible after setting data)
//        val l = rainAndWeatherChart.legend

        // modify the legend ...
//        l.form = Legend.LegendForm.LINE
//        l.textSize = 11f
//        l.textColor = Color.WHITE
//        l.verticalAlignment = Legend.LegendVerticalAlignment.BOTTOM
//        l.horizontalAlignment = Legend.LegendHorizontalAlignment.LEFT
//        l.orientation = Legend.LegendOrientation.HORIZONTAL
//        l.setDrawInside(false)
//        l.setYOffset(11f);

        val xAxis = rainAndWeatherChart.xAxis
        xAxis.textSize = 11f
        xAxis.textColor = Color.WHITE
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM)
        xAxis.setDrawGridLines(false)
        xAxis.setDrawAxisLine(false)

        val leftAxis = rainAndWeatherChart.axisLeft
        leftAxis.textColor = ColorTemplate.getHoloBlue()
//        leftAxis.axisMaximum = 200f
        leftAxis.axisMinimum = 0f
//        leftAxis.setDrawGridLines(true)
//        leftAxis.isGranularityEnabled = true


        val rightAxis = rainAndWeatherChart.axisRight
        rightAxis.textColor = Color.RED
//        rightAxis.axisMaximum = 900f
//        rightAxis.axisMinimum = -200f
        rightAxis.setDrawGridLines(false)
        rightAxis.setDrawZeroLine(false)
//        rightAxis.isGranularityEnabled = false

    }

    private fun setDataWeather(count: Int, range: Float) {

        val values1 = ArrayList<Entry>()

        for (i in 0 until count) {
            val `val` = (Math.random() * (range / 2f)).toFloat() + 50
            values1.add(Entry(i.toFloat(), `val`))
        }

        val values2 = ArrayList<Entry>()

        for (i in 0 until count) {
            val `val` = (Math.random() * range).toFloat() + 60
            values2.add(Entry(i.toFloat(), `val`))
        }

        val values3 = ArrayList<Entry>()

        for (i in 0 until count) {
            val `val` = (Math.random() * range).toFloat() + 10
            values3.add(Entry(i.toFloat(), `val`))
        }

        val set1: LineDataSet
        val set2: LineDataSet
        val set3: LineDataSet

        // create a dataset and give it a type
        set1 = LineDataSet(values1, "最低温度")
        set1.mode = LineDataSet.Mode.CUBIC_BEZIER

        set1.axisDependency = YAxis.AxisDependency.LEFT
        set1.color = ColorTemplate.getHoloBlue()
        set1.setCircleColor(Color.WHITE)
        set1.lineWidth = 2f
        set1.circleRadius = 3f
        set1.fillAlpha = 65
        set1.fillColor = ColorTemplate.getHoloBlue()
        set1.highLightColor = Color.rgb(244, 117, 117)
        set1.setDrawCircleHole(false)
        //set1.setFillFormatter(new MyFillFormatter(0f));
        //set1.setDrawHorizontalHighlightIndicator(false);
        //set1.setVisible(false);
        //set1.setCircleHoleColor(Color.WHITE);

        // create a dataset and give it a type
        set2 = LineDataSet(values2, "最高温度")
        set2.axisDependency = YAxis.AxisDependency.RIGHT
        set2.color = Color.RED
        set2.setCircleColor(Color.WHITE)
        set2.lineWidth = 2f
        set2.circleRadius = 3f
        set2.fillAlpha = 65
        set2.fillColor = Color.RED
        set2.setDrawCircleHole(false)
        set2.highLightColor = Color.rgb(244, 117, 117)
        //set2.setFillFormatter(new MyFillFormatter(900f));

        set3 = LineDataSet(values3, "PM2.5")
        set3.axisDependency = YAxis.AxisDependency.RIGHT
        set3.color = Color.YELLOW
        set3.setCircleColor(Color.WHITE)
        set3.lineWidth = 2f
        set3.circleRadius = 3f
        set3.fillAlpha = 65
        set3.fillColor = ColorTemplate.colorWithAlpha(Color.YELLOW, 200)
        set3.setDrawCircleHole(false)
        set3.highLightColor = Color.rgb(244, 117, 117)

        // create a data object with the data sets
        val data = LineData(set1, set2, set3)
        data.setValueTextColor(Color.WHITE)
        data.setValueTextSize(9f)

        // set data
        rainAndWeatherChart.data = data
    }


    private fun initData() {

//        chart_rain_2h.setViewPortOffsets(0f, 0f, 0f, 0f)
        chart_rain_2h.setBackgroundColor(Color.rgb(104, 241, 175))

        // no description text
        var description = Description()
        description.text = "2小时雨量"
        description.textColor = Color.parseColor("#000000")
        chart_rain_2h.description = description
        chart_rain_2h.getDescription().setEnabled(true)

        // enable touch gestures
        chart_rain_2h.setTouchEnabled(true)
        // enable scaling and dragging
        chart_rain_2h.setDragEnabled(true)
        chart_rain_2h.setScaleEnabled(true)

        // if disabled, scaling can be done on x- and y-axis separately
        chart_rain_2h.setPinchZoom(false)

        chart_rain_2h.zoom(2f, 1f, 0f, 0f);

        chart_rain_2h.setDrawGridBackground(false)
        chart_rain_2h.setMaxHighlightDistance(300f)


        val xAxis = chart_rain_2h.getXAxis()
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM)
        xAxis.setDrawGridLines(false)
        xAxis.setDrawAxisLine(true)
        xAxis.setTextColor(Color.WHITE)
        xAxis.setLabelCount(5, false)


        val leftAxis = chart_rain_2h.getAxisLeft()

        leftAxis.setLabelCount(5, false)
//        leftAxis.setAxisMinimum(0f) // this replaces setStartAtZero(true)
        leftAxis.setTextColor(Color.WHITE)
//        leftAxis.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART)
        leftAxis.setDrawGridLines(false)
        leftAxis.setAxisLineColor(Color.WHITE)
//        leftAxis.axisMaximum = 100f


        chart_rain_2h.getAxisRight().setEnabled(true)
        val rightAxis = chart_rain_2h.getAxisRight()
        rightAxis.setLabelCount(5, false)
        rightAxis.setDrawGridLines(false)
        rightAxis.setTextColor(Color.WHITE)
        rightAxis.setAxisLineColor(Color.WHITE)

//        rightAxis.setAxisMinimum(0f) // this replaces setStartAtZero(true)
//        rightAxis.axisMaximum = 100f


        chart_rain_2h.getLegend().setEnabled(false)

        chart_rain_2h.animateXY(2000, 2000)

        // don't forget to refresh the drawing
        chart_rain_2h.invalidate()
    }

    private fun set2hData(bean: WeatherBean) {

        val values = ArrayList<Entry>()


        for (i in 0 until bean.result.minutely.precipitation_2h.size) {
            values.add(Entry(i.toFloat(), bean.result.minutely.precipitation_2h.get(i).toFloat()*100))
        }

        val set1: LineDataSet


        // create a dataset and give it a type
        set1 = LineDataSet(values, "DataSet 1")

        set1.mode = LineDataSet.Mode.CUBIC_BEZIER
        set1.cubicIntensity = 0.2f
        set1.setDrawFilled(true)
        set1.setDrawCircles(false)
        set1.lineWidth = 1.8f
        set1.circleRadius = 4f
        set1.setCircleColor(Color.WHITE)
        set1.highLightColor = Color.rgb(244, 117, 117)
        set1.color = Color.WHITE
        set1.fillColor = Color.WHITE
        set1.fillAlpha = 100
        set1.setDrawHorizontalHighlightIndicator(false)
        set1.fillFormatter = IFillFormatter { dataSet, dataProvider -> chart_rain_2h.axisLeft.axisMinimum }

        // create a data object with the data sets
        val data = LineData(set1)
//            data.setValueTypeface(tfLight)
        data.setValueTextSize(9f)
        data.setDrawValues(false)

        // set data
        chart_rain_2h.data = data
    }


}
