.class public final Lcom/jaredrummler/android/colorpicker/c$j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jaredrummler/android/colorpicker/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation


# instance fields
.field a:I

.field b:I

.field c:I

.field d:I

.field e:I

.field f:[I

.field g:I

.field h:I

.field i:Z

.field j:Z

.field k:Z

.field l:Z

.field m:I


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lcom/jaredrummler/android/colorpicker/j;->b:I

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/c$j;->a:I

    sget v0, Lcom/jaredrummler/android/colorpicker/j;->c:I

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/c$j;->b:I

    sget v0, Lcom/jaredrummler/android/colorpicker/j;->a:I

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/c$j;->c:I

    sget v0, Lcom/jaredrummler/android/colorpicker/j;->d:I

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/c$j;->d:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/c$j;->e:I

    sget-object v1, Lcom/jaredrummler/android/colorpicker/c;->b:[I

    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/c$j;->f:[I

    const/high16 v1, -0x1000000

    iput v1, p0, Lcom/jaredrummler/android/colorpicker/c$j;->g:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/jaredrummler/android/colorpicker/c$j;->h:I

    iput-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/c$j;->i:Z

    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/c$j;->j:Z

    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/c$j;->k:Z

    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/c$j;->l:Z

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/c$j;->m:I

    return-void
.end method


# virtual methods
.method public a()Lcom/jaredrummler/android/colorpicker/c;
    .locals 4

    new-instance v0, Lcom/jaredrummler/android/colorpicker/c;

    invoke-direct {v0}, Lcom/jaredrummler/android/colorpicker/c;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget v2, p0, Lcom/jaredrummler/android/colorpicker/c$j;->h:I

    const-string v3, "id"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v2, p0, Lcom/jaredrummler/android/colorpicker/c$j;->e:I

    const-string v3, "dialogType"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v2, p0, Lcom/jaredrummler/android/colorpicker/c$j;->g:I

    const-string v3, "color"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/c$j;->f:[I

    const-string v3, "presets"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    iget-boolean v2, p0, Lcom/jaredrummler/android/colorpicker/c$j;->i:Z

    const-string v3, "alpha"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-boolean v2, p0, Lcom/jaredrummler/android/colorpicker/c$j;->k:Z

    const-string v3, "allowCustom"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-boolean v2, p0, Lcom/jaredrummler/android/colorpicker/c$j;->j:Z

    const-string v3, "allowPresets"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget v2, p0, Lcom/jaredrummler/android/colorpicker/c$j;->a:I

    const-string v3, "dialogTitle"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-boolean v2, p0, Lcom/jaredrummler/android/colorpicker/c$j;->l:Z

    const-string v3, "showColorShades"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget v2, p0, Lcom/jaredrummler/android/colorpicker/c$j;->m:I

    const-string v3, "colorShape"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v2, p0, Lcom/jaredrummler/android/colorpicker/c$j;->b:I

    const-string v3, "presetsButtonText"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v2, p0, Lcom/jaredrummler/android/colorpicker/c$j;->c:I

    const-string v3, "customButtonText"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v2, p0, Lcom/jaredrummler/android/colorpicker/c$j;->d:I

    const-string v3, "selectedButtonText"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroid/app/DialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public b(Z)Lcom/jaredrummler/android/colorpicker/c$j;
    .locals 0

    iput-boolean p1, p0, Lcom/jaredrummler/android/colorpicker/c$j;->j:Z

    return-object p0
.end method

.method public c(I)Lcom/jaredrummler/android/colorpicker/c$j;
    .locals 0

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/c$j;->g:I

    return-object p0
.end method

.method public d(I)Lcom/jaredrummler/android/colorpicker/c$j;
    .locals 0

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/c$j;->a:I

    return-object p0
.end method

.method public e(I)Lcom/jaredrummler/android/colorpicker/c$j;
    .locals 0

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/c$j;->e:I

    return-object p0
.end method

.method public f(Z)Lcom/jaredrummler/android/colorpicker/c$j;
    .locals 0

    iput-boolean p1, p0, Lcom/jaredrummler/android/colorpicker/c$j;->i:Z

    return-object p0
.end method

.method public g(Landroid/app/Activity;)V
    .locals 2

    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/c$j;->a()Lcom/jaredrummler/android/colorpicker/c;

    move-result-object v0

    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p1

    const-string v1, "color-picker-dialog"

    invoke-virtual {v0, p1, v1}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method
