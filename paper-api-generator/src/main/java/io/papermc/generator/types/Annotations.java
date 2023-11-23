package io.papermc.generator.types;

import com.squareup.javapoet.AnnotationSpec;
import java.util.List;
import org.bukkit.MinecraftExperimental;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

public final class Annotations {

    public static final List<AnnotationSpec> EXPERIMENTAL_ANNOTATIONS = List.of(
        AnnotationSpec.builder(ApiStatus.Experimental.class).build(),
        AnnotationSpec.builder(MinecraftExperimental.class)
            .addMember("value", "$S", "update 1.20")
            .build()
    );

    @ApiStatus.Experimental
    public static final AnnotationSpec EXPERIMENTAL_API_ANNOTATION = AnnotationSpec.builder(ApiStatus.Experimental.class).build();
    public static final AnnotationSpec NOT_NULL = AnnotationSpec.builder(NotNull.class).build();

    private Annotations() {
    }
}
