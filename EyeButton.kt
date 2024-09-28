package ru.aleksey.eyebtn

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val eye_open = ImageVector.Builder(
    name = "Eye_open",
    defaultWidth = 108.dp,
    defaultHeight = 108.dp,
    viewportWidth = 108f,
    viewportHeight = 108f
).apply {
    group {
        path(
            fill = null,
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(0f, 0f)
            horizontalLineTo(108f)
            verticalLineTo(108f)
            horizontalLineTo(0f)
            verticalLineTo(0f)
            close()
        }
        group {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(105.66f, 55.06f)
                curveToRelative(-4.670f, -6.920f, -9.650f, -12.840f, -14.890f, -17.710f)
                lineToRelative(6.07f, -7.3f)
                curveToRelative(1.770f, -2.120f, 1.480f, -5.280f, -0.650f, -7.040f)
                curveToRelative(-2.120f, -1.770f, -5.280f, -1.480f, -7.040f, 0.650f)
                lineToRelative(-6.14f, 7.38f)
                curveToRelative(-0.530f, -0.370f, -1.050f, -0.730f, -1.580f, -1.080f)
                curveToRelative(-3.680f, -2.430f, -7.440f, -4.350f, -11.250f, -5.770f)
                lineToRelative(1.97f, -7.53f)
                curveToRelative(0.70f, -2.670f, -0.90f, -5.40f, -3.570f, -6.10f)
                curveToRelative(-2.670f, -0.70f, -5.40f, 0.90f, -6.10f, 3.570f)
                lineToRelative(-1.97f, 7.55f)
                curveToRelative(-2.160f, -0.320f, -4.320f, -0.480f, -6.50f, -0.480f)
                reflectiveCurveToRelative(-4.55f, 0.18f, -6.8f, 0.52f)
                lineToRelative(-1.69f, -7.44f)
                curveToRelative(-0.610f, -2.690f, -3.290f, -4.380f, -5.980f, -3.770f)
                curveToRelative(-2.690f, 0.610f, -4.380f, 3.290f, -3.770f, 5.980f)
                lineToRelative(1.77f, 7.8f)
                curveToRelative(-3.710f, 1.410f, -7.370f, 3.290f, -10.960f, 5.660f)
                curveToRelative(-0.590f, 0.390f, -1.180f, 0.790f, -1.760f, 1.210f)
                lineToRelative(-5.36f, -6.81f)
                curveToRelative(-1.710f, -2.170f, -4.850f, -2.540f, -7.020f, -0.840f)
                curveToRelative(-2.170f, 1.710f, -2.540f, 4.850f, -0.840f, 7.020f)
                lineToRelative(5.48f, 6.96f)
                curveToRelative(-5.180f, 4.840f, -10.110f, 10.710f, -14.730f, 17.560f)
                curveToRelative(-1.20f, 1.780f, -1.20f, 4.10f, 00f, 5.880f)
                curveToRelative(7.370f, 10.920f, 15.530f, 19.370f, 24.230f, 25.10f)
                curveToRelative(8.820f, 5.810f, 18.040f, 8.750f, 27.430f, 8.750f)
                reflectiveCurveToRelative(18.61f, -2.94f, 27.43f, -8.75f)
                curveToRelative(8.70f, -5.730f, 16.860f, -14.180f, 24.230f, -25.10f)
                curveToRelative(1.20f, -1.780f, 1.20f, -4.10f, 00f, -5.880f)
                close()
                moveToRelative(-30.01f, 22.2f)
                curveToRelative(-7.070f, 4.660f, -14.350f, 7.020f, -21.650f, 7.020f)
                reflectiveCurveToRelative(-14.57f, -2.36f, -21.65f, -7.02f)
                curveToRelative(-6.760f, -4.450f, -13.230f, -10.920f, -19.240f, -19.260f)
                curveToRelative(6.020f, -8.340f, 12.480f, -14.810f, 19.240f, -19.260f)
                curveToRelative(7.070f, -4.660f, 14.350f, -7.020f, 21.650f, -7.020f)
                reflectiveCurveToRelative(14.57f, 2.36f, 21.65f, 7.02f)
                curveToRelative(6.760f, 4.450f, 13.230f, 10.920f, 19.240f, 19.260f)
                curveToRelative(-6.020f, 8.340f, -12.480f, 14.810f, -19.240f, 19.260f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(69.98f, 53.41f)
                curveToRelative(-1.460f, 1.120f, -3.320f, 1.760f, -5.330f, 1.670f)
                curveToRelative(-4.160f, -0.190f, -7.540f, -3.570f, -7.730f, -7.730f)
                curveToRelative(-0.090f, -2.010f, 0.550f, -3.870f, 1.670f, -5.330f)
                curveToRelative(0.560f, -0.730f, 0.180f, -1.810f, -0.720f, -2.010f)
                curveToRelative(-1.290f, -0.280f, -2.620f, -0.420f, -3.990f, -0.410f)
                curveToRelative(-10.170f, 0.060f, -18.420f, 8.490f, -18.270f, 18.670f)
                curveToRelative(0.140f, 9.940f, 8.180f, 17.980f, 18.120f, 18.120f)
                curveToRelative(10.170f, 0.150f, 18.60f, -8.10f, 18.670f, -18.270f)
                curveToRelative(00f, -1.370f, -0.130f, -2.710f, -0.410f, -3.990f)
                curveToRelative(-0.190f, -0.910f, -1.270f, -1.290f, -2.010f, -0.720f)
                close()
            }
        }
    }
}.build()

val eye_closed = ImageVector.Builder(
    name = "Eye_closed",
    defaultWidth = 108.dp,
    defaultHeight = 108.dp,
    viewportWidth = 108f,
    viewportHeight = 108f
).apply {
    group {
        path(
            fill = null,
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(0f, 0f)
            horizontalLineTo(108f)
            verticalLineTo(108f)
            horizontalLineTo(0f)
            verticalLineTo(0f)
            close()
        }
        path(
            fill = SolidColor(Color.Black),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(67.13f, 87.07f)
            curveToRelative(-2.40f, 00f, -4.560f, -1.650f, -5.120f, -4.090f)
            lineToRelative(-1.54f, -6.76f)
            curveToRelative(-4.310f, 0.460f, -8.630f, 0.460f, -12.940f, 00f)
            lineToRelative(-1.54f, 6.76f)
            curveToRelative(-0.650f, 2.830f, -3.460f, 4.60f, -6.290f, 3.950f)
            curveToRelative(-2.830f, -0.650f, -4.60f, -3.460f, -3.950f, -6.290f)
            lineToRelative(1.47f, -6.44f)
            curveToRelative(-4.730f, -1.340f, -9.270f, -3.220f, -13.570f, -5.60f)
            lineToRelative(-5f, 6.05f)
            curveToRelative(-1.850f, 2.240f, -5.160f, 2.550f, -7.40f, 0.70f)
            curveToRelative(-2.240f, -1.850f, -2.550f, -5.160f, -0.70f, -7.40f)
            lineToRelative(4.28f, -5.18f)
            curveToRelative(-4.480f, -3.450f, -8.560f, -7.40f, -12.170f, -11.780f)
            curveToRelative(-1.850f, -2.240f, -1.530f, -5.550f, 0.710f, -7.40f)
            curveToRelative(2.240f, -1.850f, 5.550f, -1.530f, 7.40f, 0.710f)
            curveToRelative(4.160f, 5.050f, 9.050f, 9.430f, 14.520f, 13.010f)
            curveToRelative(0.040f, 0.020f, 0.080f, 0.050f, 0.110f, 0.070f)
            curveToRelative(5.780f, 3.760f, 12.130f, 6.350f, 18.880f, 7.70f)
            curveToRelative(0.130f, 0.020f, 0.250f, 0.040f, 0.380f, 0.070f)
            curveToRelative(0.010f, 00f, 0.030f, 00f, 0.040f, 00f)
            curveToRelative(6.170f, 1.160f, 12.430f, 1.160f, 18.60f, 00f)
            curveToRelative(0.010f, 00f, 0.030f, 00f, 0.040f, 00f)
            curveToRelative(0.130f, -0.030f, 0.250f, -0.050f, 0.380f, -0.070f)
            curveToRelative(6.760f, -1.350f, 13.110f, -3.940f, 18.890f, -7.710f)
            curveToRelative(0.040f, -0.020f, 0.070f, -0.050f, 0.110f, -0.070f)
            curveToRelative(5.470f, -3.590f, 10.360f, -7.960f, 14.520f, -13.010f)
            curveToRelative(1.850f, -2.240f, 5.160f, -2.560f, 7.40f, -0.710f)
            curveToRelative(2.240f, 1.850f, 2.560f, 5.160f, 0.710f, 7.40f)
            curveToRelative(-3.610f, 4.380f, -7.690f, 8.320f, -12.170f, 11.780f)
            lineToRelative(4.28f, 5.18f)
            curveToRelative(1.850f, 2.240f, 1.530f, 5.550f, -0.70f, 7.40f)
            curveToRelative(-2.240f, 1.850f, -5.550f, 1.530f, -7.40f, -0.70f)
            lineToRelative(-5f, -6.05f)
            curveToRelative(-4.30f, 2.390f, -8.840f, 4.260f, -13.570f, 5.60f)
            lineToRelative(1.47f, 6.44f)
            curveToRelative(0.650f, 2.830f, -1.120f, 5.650f, -3.950f, 6.290f)
            curveToRelative(-0.390f, 0.090f, -0.790f, 0.130f, -1.170f, 0.130f)
            close()
        }
    }
}.build()

@Composable
fun eyeButton(
    background: Color = Color.White,
    padding: Dp = 10.dp,
    size: Dp = 108.dp,
    rounded: Int = 50,
    tint: Color = Color.White
): Boolean {
    var ret by remember { mutableStateOf(false) }
    var im by remember { mutableStateOf(eye_closed) }

    Card(
        onClick = {
            ret = !ret
            im = if(ret) {
                eye_open
            } else {
                eye_closed
            }
        },
        shape = RoundedCornerShape(rounded),
        colors = CardColors(
            containerColor = background,
            contentColor = tint,
            disabledContainerColor = background,
            disabledContentColor = tint

        )
    ) {
        Icon(modifier = Modifier.padding(padding).size(size),
            imageVector = im,
            contentDescription = "", tint = tint
        )
    }
    return ret
}
