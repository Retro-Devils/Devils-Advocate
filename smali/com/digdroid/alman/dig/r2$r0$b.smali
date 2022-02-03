.class Lcom/digdroid/alman/dig/r2$r0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2$r0;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/r2$r0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2$r0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$r0$b;->b:Lcom/digdroid/alman/dig/r2$r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$r0$b;->b:Lcom/digdroid/alman/dig/r2$r0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$r0;->b:Landroid/widget/Switch;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/Switch;->setChecked(Z)V

    return-void
.end method
