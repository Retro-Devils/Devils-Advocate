.class Lb/c/a/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/c/a/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/c/a/b;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/c/a/b;


# direct methods
.method constructor <init>(Lb/c/a/b;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/b$a;->a:Lb/c/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;Landroid/graphics/RectF;FLandroid/graphics/Paint;)V
    .locals 0

    invoke-virtual {p1, p2, p3, p3, p4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void
.end method
