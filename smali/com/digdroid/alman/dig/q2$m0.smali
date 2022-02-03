.class Lcom/digdroid/alman/dig/q2$m0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2;->F3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/appcompat/widget/SwitchCompat;

.field final synthetic c:Lcom/digdroid/alman/dig/q2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2;Landroidx/appcompat/widget/SwitchCompat;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$m0;->c:Lcom/digdroid/alman/dig/q2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/q2$m0;->b:Landroidx/appcompat/widget/SwitchCompat;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$m0;->b:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$m0;->b:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/q2$m0;->c:Lcom/digdroid/alman/dig/q2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v1, "auto_scan"

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->A(Ljava/lang/String;Z)V

    return-void
.end method
