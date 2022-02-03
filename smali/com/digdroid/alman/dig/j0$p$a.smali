.class Lcom/digdroid/alman/dig/j0$p$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/j0$a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0$p;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/j0$p;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0$p;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$p$a;->a:Lcom/digdroid/alman/dig/j0$p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$p$a;->a:Lcom/digdroid/alman/dig/j0$p;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0$p;->b:Lcom/digdroid/alman/dig/j0;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/j0;->v3(Z)V

    :cond_0
    return-void
.end method
