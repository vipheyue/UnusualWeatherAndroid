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
    var resultBean: WeatherBean? = null;
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getNetData("https://api.caiyunapp.com/v2/Kg47BflU7B5pPOGN/121.6544,25.1552/forecast.json")
//        getNetData("https://api.caiyunapp.com/v2/Kg47BflU7B5pPOGN/111.613221,22.086306/forecast.json")



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
                    resultBean=bean
                    init2HView()
                    set2hData(bean)
                    chart_rain_2h.invalidate()


                    init2DayView()
                    set2DayData(bean)
                    chart_rain_2day.invalidate()

                    initDataWeatherView()
                    setDataWeather(bean)
                    rainAndWeatherChart.invalidate()



                    initPm25View()
                    setPm25Data(bean)
                    pm25Chart.invalidate()
                }

                override fun onError(e: Throwable) {
                    e.printStackTrace()
                }
            })
//        println(result)
//        return result
    }

    private fun initDataWeatherView() {
//        rainAndWeatherChart.setViewPortOffsets(0f, 0f, 0f, 0f)

        var description = Description()
        description.text = "5日天气"
        description.textColor = Color.parseColor("#000000")
        rainAndWeatherChart.description = description
        rainAndWeatherChart.getDescription().setEnabled(true)

        rainAndWeatherChart.setBackgroundColor(Color.rgb(104, 241, 175))


        // enable touch gestures
        rainAndWeatherChart.setTouchEnabled(false)
        // enable scaling and dragging
        rainAndWeatherChart.setDragEnabled(false)
        rainAndWeatherChart.setScaleEnabled(false)

        // if disabled, scaling can be done on x- and y-axis separately
        rainAndWeatherChart.setPinchZoom(false)


        rainAndWeatherChart.setDrawGridBackground(false)
        rainAndWeatherChart.setMaxHighlightDistance(300f)


        val xAxis = rainAndWeatherChart.xAxis
        xAxis.textSize = 11f
        xAxis.textColor = Color.WHITE
        xAxis.setPosition(XAxis.XAxisPosition.TOP)
        xAxis.setDrawGridLines(false)
        xAxis.setDrawAxisLine(true)
//        xAxis.setLabelCount(5, false)

        xAxis.setValueFormatter { value, axis ->   resultBean?.let {
            var dateString = it.result.daily.precipitation[(value/100).toInt()].date
            var skq = it.result.daily.skycon[(value/100).toInt()].value
            dateString.substring(5,dateString.length)+Skycon.getLogo(skq)
        } }

        val leftAxis = rainAndWeatherChart.axisLeft
        leftAxis.textColor = ColorTemplate.getHoloBlue()
        leftAxis.setLabelCount(3, false)

//        leftAxis.axisMaximum = 200f
//        leftAxis.axisMinimum = 0f
//        leftAxis.setDrawGridLines(true)
//        leftAxis.isGranularityEnabled = true


        val rightAxis = rainAndWeatherChart.axisRight
        rightAxis.textColor = Color.RED
//        rightAxis.axisMaximum = 900f
        rightAxis.axisMinimum = 0f
        rightAxis.setDrawGridLines(false)
        rightAxis.setLabelCount(3, false)

        rightAxis.setDrawZeroLine(false)
//        rightAxis.isGranularityEnabled = false

    }

    private fun setDataWeather(resultBean: WeatherBean) {
        var temperatureList = resultBean.result.daily.temperature


        val maxTemperature = ArrayList<Entry>()

        val minTemperature = ArrayList<Entry>()
//        val pm25List = ArrayList<Entry>()

        for (i in 0 until temperatureList.size) {
            maxTemperature.add(Entry(i.toFloat()*100, temperatureList.get(i).max.toFloat()))
            minTemperature.add(Entry(i.toFloat()*100, temperatureList.get(i).min.toFloat()))
//            pm25List.add(Entry(i.toFloat(), resultBean.result.daily.pm25.get(i).max.toFloat()))

        }


        val set1: LineDataSet
        val set2: LineDataSet

        // create a dataset and give it a type
        set1 = LineDataSet(minTemperature, "最低温度")
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
        set2 = LineDataSet(maxTemperature, "最高温度")
        set2.axisDependency = YAxis.AxisDependency.LEFT
        set2.color = Color.RED
        set2.setCircleColor(Color.WHITE)
        set2.lineWidth = 2f
        set2.circleRadius = 3f
        set2.fillAlpha = 65
        set2.fillColor = Color.RED
        set2.setDrawCircleHole(false)
        set2.highLightColor = Color.rgb(244, 117, 117)
        //set2.setFillFormatter(new MyFillFormatter(900f));


        // create a data object with the data sets
        val data = LineData(set1, set2)
        data.setValueTextColor(Color.WHITE)
        data.setValueTextSize(9f)

        // set data
        rainAndWeatherChart.data = data
    }


    private fun init2HView() {

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

        leftAxis.setLabelCount(3, false)
        leftAxis.setAxisMinimum(0f) // this replaces setStartAtZero(true)
        leftAxis.setTextColor(Color.WHITE)
//        leftAxis.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART)
        leftAxis.setDrawGridLines(false)
        leftAxis.setAxisLineColor(Color.WHITE)
        leftAxis.axisMaximum = 100f
        leftAxis.setValueFormatter { value, axis ->
            when ((value).toInt()) {
                in 0..1->""
                in 1..25 ->"小雨"
                in 25..35->"中雨"
                else -> "大雨"
            }

        }



        chart_rain_2h.getAxisRight().setEnabled(true)
        val rightAxis = chart_rain_2h.getAxisRight()
        rightAxis.setLabelCount(3, false)
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
    private fun init2DayView() {

//        chart_rain_2day.setViewPortOffsets(0f, 0f, 0f, 0f)
        chart_rain_2day.setBackgroundColor(Color.rgb(104, 241, 175))

        // no description text
        var description = Description()
        description.text = "48小时雨量"
        description.textColor = Color.parseColor("#000000")
        chart_rain_2day.description = description
        chart_rain_2day.getDescription().setEnabled(true)

        // enable touch gestures
        chart_rain_2day.setTouchEnabled(true)
        // enable scaling and dragging
        chart_rain_2day.setDragEnabled(true)
        chart_rain_2day.setScaleEnabled(true)

        // if disabled, scaling can be done on x- and y-axis separately
        chart_rain_2day.setPinchZoom(false)

//        chart_rain_2day.zoom(2f, 1f, 0f, 0f);

        chart_rain_2day.setDrawGridBackground(false)
        chart_rain_2day.setMaxHighlightDistance(300f)


        val xAxis = chart_rain_2day.getXAxis()
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM)
        xAxis.setDrawGridLines(false)
        xAxis.setDrawAxisLine(true)
        xAxis.setTextColor(Color.WHITE)
        xAxis.setLabelCount(5, false)


        val leftAxis = chart_rain_2day.getAxisLeft()

        leftAxis.setLabelCount(3, false)
        leftAxis.setAxisMinimum(0f) // this replaces setStartAtZero(true)
        leftAxis.setTextColor(Color.WHITE)
//        leftAxis.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART)
        leftAxis.setDrawGridLines(false)
        leftAxis.setAxisLineColor(Color.WHITE)
//        leftAxis.axisMaximum = 100f
        leftAxis.setValueFormatter { value, axis ->
            when ((value).toInt()) {
                in 0..1 -> ""
                in 1..25 -> "小雨"
                in 25..35 -> "中雨"
                else -> "大雨"
            }
        }

        chart_rain_2day.getAxisRight().setEnabled(true)
        val rightAxis = chart_rain_2day.getAxisRight()
        rightAxis.setLabelCount(3, false)
        rightAxis.setDrawGridLines(false)
        rightAxis.setTextColor(Color.WHITE)
        rightAxis.setAxisLineColor(Color.WHITE)

//        rightAxis.setAxisMinimum(0f) // this replaces setStartAtZero(true)
//        rightAxis.axisMaximum = 100f

        chart_rain_2day.getLegend().setEnabled(false)

        chart_rain_2day.animateXY(2000, 2000)

        // don't forget to refresh the drawing
        chart_rain_2day.invalidate()
    }
    private fun initPm25View() {

//        pm25Chart.setViewPortOffsets(0f, 0f, 0f, 0f)
        pm25Chart.setBackgroundColor(Color.rgb(104, 241, 175))

        // no description text
        var description = Description()
        description.text = "5日PM2.5"
        description.textColor = Color.parseColor("#000000")
        pm25Chart.description = description
        pm25Chart.getDescription().setEnabled(true)

        // enable touch gestures
        pm25Chart.setTouchEnabled(true)
        // enable scaling and dragging
        pm25Chart.setDragEnabled(true)
        pm25Chart.setScaleEnabled(true)

        // if disabled, scaling can be done on x- and y-axis separately
        pm25Chart.setPinchZoom(false)

//        pm25Chart.zoom(2f, 1f, 0f, 0f);

        pm25Chart.setDrawGridBackground(false)
        pm25Chart.setMaxHighlightDistance(300f)


        val xAxis = pm25Chart.getXAxis()
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM)
        xAxis.setDrawGridLines(false)
        xAxis.setDrawAxisLine(true)
        xAxis.setTextColor(Color.WHITE)
        xAxis.setLabelCount(5, false)


        val leftAxis = pm25Chart.getAxisLeft()

        leftAxis.setLabelCount(3, false)
        leftAxis.setAxisMinimum(0f) // this replaces setStartAtZero(true)
        leftAxis.setTextColor(Color.WHITE)
//        leftAxis.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART)
        leftAxis.setDrawGridLines(false)
        leftAxis.setAxisLineColor(Color.WHITE)
//        leftAxis.axisMaximum = 100f


        pm25Chart.getAxisRight().setEnabled(true)
        val rightAxis = pm25Chart.getAxisRight()
        rightAxis.setLabelCount(3, false)
        rightAxis.setDrawGridLines(false)
        rightAxis.setTextColor(Color.WHITE)
        rightAxis.setAxisLineColor(Color.WHITE)

//        rightAxis.setAxisMinimum(0f) // this replaces setStartAtZero(true)
//        rightAxis.axisMaximum = 100f


        pm25Chart.getLegend().setEnabled(false)

        pm25Chart.animateXY(2000, 2000)

        // don't forget to refresh the drawing
        pm25Chart.invalidate()
    }

    private fun set2hData(bean: WeatherBean) {

        val values = ArrayList<Entry>()


        for (i in 0 until bean.result.minutely.precipitation_2h.size) {
            values.add(Entry(i.toFloat(), (bean.result.minutely.precipitation_2h.get(i)*100).toFloat()))
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
    private fun set2DayData(bean: WeatherBean) {

        val values = ArrayList<Entry>()


        for (i in 0 until bean.result.hourly.precipitation.size) {
            values.add(Entry(i.toFloat(), bean.result.hourly.precipitation.get(i).value.toFloat()*100))
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
        set1.fillFormatter = IFillFormatter { dataSet, dataProvider -> chart_rain_2day.axisLeft.axisMinimum }

        // create a data object with the data sets
        val data = LineData(set1)
//            data.setValueTypeface(tfLight)
        data.setValueTextSize(9f)
        data.setDrawValues(false)

        // set data
        chart_rain_2day.data = data
    }
    private fun setPm25Data(bean: WeatherBean) {

        val values = ArrayList<Entry>()


        for (i in 0 until bean.result.daily.pm25.size) {
            values.add(Entry(i.toFloat(), bean.result.daily.pm25.get(i).max.toFloat()))
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
        set1.fillColor = Color.YELLOW
        set1.fillAlpha = 100
        set1.setDrawHorizontalHighlightIndicator(false)
        set1.fillFormatter = IFillFormatter { dataSet, dataProvider -> pm25Chart.axisLeft.axisMinimum }

        // create a data object with the data sets
        val data = LineData(set1)
//            data.setValueTypeface(tfLight)
        data.setValueTextColor(Color.WHITE)
        data.setValueTextSize(9f)
        data.setDrawValues(true)

        // set data
        pm25Chart.data = data
    }


}
