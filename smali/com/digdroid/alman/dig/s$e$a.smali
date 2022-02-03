.class Lcom/digdroid/alman/dig/s$e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s$e;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/s$e;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s$e;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$e$a;->b:Lcom/digdroid/alman/dig/s$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$e$a;->b:Lcom/digdroid/alman/dig/s$e;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s$e;->b:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->v0:Lcom/digdroid/alman/dig/r3;

    const-string p2, "name"

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/z3;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    iget-object v2, p1, Lcom/digdroid/alman/dig/r3;->f:Ljava/lang/String;

    const/4 v3, 0x1

    if-nez v2, :cond_4

    const/4 v2, 0x1

    :cond_1
    invoke-static {v0}, Lcom/digdroid/alman/dig/z3;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v4, "theme"

    :cond_2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ")"

    const-string v6, " ("

    if-ne v2, v3, :cond_3

    move-object v7, v1

    goto :goto_0

    :cond_3
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    :goto_0
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ".cfg"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, p1, Lcom/digdroid/alman/dig/r3;->f:Ljava/lang/String;

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/r3;->z()Z

    move-result v5

    if-nez v5, :cond_1

    add-int/lit8 v2, v2, -0x1

    if-le v2, v3, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iget-object p2, p0, Lcom/digdroid/alman/dig/s$e$a;->b:Lcom/digdroid/alman/dig/s$e;

    iget-object p2, p2, Lcom/digdroid/alman/dig/s$e;->b:Lcom/digdroid/alman/dig/s;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p2

    check-cast p2, Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {p2, v3}, Lcom/digdroid/alman/dig/b4;->g(Z)Landroid/graphics/Point;

    move-result-object p2

    iget v0, p2, Landroid/graphics/Point;->x:I

    const-string v1, "theme_width"

    invoke-virtual {p1, v1, v0}, Lcom/digdroid/alman/dig/n;->p(Ljava/lang/String;I)V

    iget v0, p2, Landroid/graphics/Point;->y:I

    const-string v1, "theme_height"

    invoke-virtual {p1, v1, v0}, Lcom/digdroid/alman/dig/n;->p(Ljava/lang/String;I)V

    iget v0, p2, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    iget p2, p2, Landroid/graphics/Point;->y:I

    int-to-float p2, p2

    div-float/2addr v0, p2

    const-string p2, "theme_aspect_ratio"

    invoke-virtual {p1, p2, v0}, Lcom/digdroid/alman/dig/n;->n(Ljava/lang/String;F)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/s$e$a;->b:Lcom/digdroid/alman/dig/s$e;

    iget-object p2, p2, Lcom/digdroid/alman/dig/s$e;->b:Lcom/digdroid/alman/dig/s;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->x0()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    const-string v0, "theme_density"

    invoke-virtual {p1, v0, p2}, Lcom/digdroid/alman/dig/n;->n(Ljava/lang/String;F)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/s$e$a;->b:Lcom/digdroid/alman/dig/s$e;

    iget-object p2, p2, Lcom/digdroid/alman/dig/s$e;->b:Lcom/digdroid/alman/dig/s;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->x0()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->scaledDensity:F

    const-string v0, "theme_scaled_density"

    invoke-virtual {p1, v0, p2}, Lcom/digdroid/alman/dig/n;->n(Ljava/lang/String;F)V

    sget-object p2, Lcom/digdroid/alman/dig/p3;->a:Lcom/digdroid/alman/dig/s3;

    iget-object p2, p2, Lcom/digdroid/alman/dig/s3;->j:Ljava/lang/String;

    iget-object v0, p0, Lcom/digdroid/alman/dig/s$e$a;->b:Lcom/digdroid/alman/dig/s$e;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s$e;->b:Lcom/digdroid/alman/dig/s;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    iget-object v1, p1, Lcom/digdroid/alman/dig/r3;->f:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/p3;->o(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v0, p1, Lcom/digdroid/alman/dig/r3;->f:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/r3;->S(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$e$a;->b:Lcom/digdroid/alman/dig/s$e;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s$e;->b:Lcom/digdroid/alman/dig/s;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/z3;->t(Landroid/app/Activity;)V

    return-void
.end method
