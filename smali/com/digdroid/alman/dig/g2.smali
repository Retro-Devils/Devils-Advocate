.class Lcom/digdroid/alman/dig/g2;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/g2$b;
    }
.end annotation


# instance fields
.field a:Lcom/digdroid/alman/dig/l;

.field b:I

.field c:I

.field d:Z

.field e:Lcom/digdroid/alman/dig/g2$b;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/l;IIZLcom/digdroid/alman/dig/g2$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/g2;->a:Lcom/digdroid/alman/dig/l;

    iput p2, p0, Lcom/digdroid/alman/dig/g2;->b:I

    iput p3, p0, Lcom/digdroid/alman/dig/g2;->c:I

    iput-boolean p4, p0, Lcom/digdroid/alman/dig/g2;->d:Z

    iput-object p5, p0, Lcom/digdroid/alman/dig/g2;->e:Lcom/digdroid/alman/dig/g2$b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    iget-object v0, p0, Lcom/digdroid/alman/dig/g2;->a:Lcom/digdroid/alman/dig/l;

    invoke-static {v0}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    iget v0, p0, Lcom/digdroid/alman/dig/g2;->c:I

    shr-int/lit8 v1, v0, 0x10

    and-int/lit16 v5, v1, 0xff

    shr-int/lit8 v1, v0, 0x8

    and-int/lit16 v6, v1, 0xff

    and-int/lit16 v7, v0, 0xff

    shr-int/lit8 v0, v0, 0x18

    and-int/lit16 v4, v0, 0xff

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/g2;->d:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/pes/androidmaterialcolorpickerdialog/b;

    iget-object v3, p0, Lcom/digdroid/alman/dig/g2;->a:Lcom/digdroid/alman/dig/l;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/pes/androidmaterialcolorpickerdialog/b;-><init>(Landroid/app/Activity;IIII)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pes/androidmaterialcolorpickerdialog/b;

    iget-object v1, p0, Lcom/digdroid/alman/dig/g2;->a:Lcom/digdroid/alman/dig/l;

    invoke-direct {v0, v1, v5, v6, v7}, Lcom/pes/androidmaterialcolorpickerdialog/b;-><init>(Landroid/app/Activity;III)V

    :goto_0
    new-instance v1, Lcom/digdroid/alman/dig/g2$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/g2$a;-><init>(Lcom/digdroid/alman/dig/g2;)V

    invoke-virtual {v0, v1}, Lcom/pes/androidmaterialcolorpickerdialog/b;->i(Lcom/pes/androidmaterialcolorpickerdialog/c;)V

    invoke-virtual {v0}, Lcom/pes/androidmaterialcolorpickerdialog/b;->e()V

    invoke-virtual {v0}, Lcom/pes/androidmaterialcolorpickerdialog/b;->show()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/g2;->a:Lcom/digdroid/alman/dig/l;

    iget-object v1, p0, Lcom/digdroid/alman/dig/g2;->e:Lcom/digdroid/alman/dig/g2$b;

    iput-object v1, v0, Lcom/digdroid/alman/dig/l;->L:Lcom/digdroid/alman/dig/g2$b;

    invoke-static {}, Lcom/jaredrummler/android/colorpicker/c;->j()Lcom/jaredrummler/android/colorpicker/c$j;

    move-result-object v0

    iget v1, p0, Lcom/digdroid/alman/dig/g2;->c:I

    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/c$j;->c(I)Lcom/jaredrummler/android/colorpicker/c$j;

    move-result-object v0

    iget v1, p0, Lcom/digdroid/alman/dig/g2;->b:I

    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/c$j;->d(I)Lcom/jaredrummler/android/colorpicker/c$j;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/c$j;->e(I)Lcom/jaredrummler/android/colorpicker/c$j;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/c$j;->b(Z)Lcom/jaredrummler/android/colorpicker/c$j;

    move-result-object v0

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/g2;->d:Z

    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/c$j;->f(Z)Lcom/jaredrummler/android/colorpicker/c$j;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/g2;->a:Lcom/digdroid/alman/dig/l;

    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/c$j;->g(Landroid/app/Activity;)V

    :goto_1
    return-void
.end method
