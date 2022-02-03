.class Lcom/digdroid/alman/dig/r2$n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2;->r3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/appcompat/widget/SwitchCompat;

.field final synthetic c:Lcom/digdroid/alman/dig/r2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2;Landroidx/appcompat/widget/SwitchCompat;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$n;->c:Lcom/digdroid/alman/dig/r2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r2$n;->b:Landroidx/appcompat/widget/SwitchCompat;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$n;->b:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$n;->c:Lcom/digdroid/alman/dig/r2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$n;->b:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    const-string v1, "external_browser"

    invoke-virtual {p1, v1, v0}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V

    return-void
.end method
