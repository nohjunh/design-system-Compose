package com.example.designsystemdemo.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * A class to model gradient color values for Demo Project.
 *
 * @param top The top gradient color to be rendered.
 * @param bottom The bottom gradient color to be rendered.
 * @param container The container gradient color over which the gradient will be rendered.
 */
@Immutable // 불변성 데이터 클래스를 선언 -> 한 번 생성된 후 내부 상태 변경 불가
data class GradientColors( // 3가지 프로퍼티를 가지고 있음
    val top: Color = Color.Unspecified, // Gradient의 상단 색상
    val bottom: Color = Color.Unspecified, // Gradient의 하단 색상
    val container: Color = Color.Unspecified, // Gradient가 적용되는 컨테이너 색상
)

/**
 * A composition local for [GradientColors].
 */
val LocalGradientColors = // LocalGradientColors라는 Composition Local 선언 -> Compose의 상태 공유 메커니즘
    staticCompositionLocalOf {
        // 기본적으로 GradientColors 인스턴스를 제공하는 Composition Local 생성
        GradientColors()
    }
