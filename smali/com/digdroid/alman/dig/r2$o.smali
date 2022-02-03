.class Lcom/digdroid/alman/dig/r2$o;
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
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/digdroid/alman/dig/r2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$o;->c:Lcom/digdroid/alman/dig/r2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r2$o;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$o;->b:Landroid/app/Activity;

    new-instance v1, Lcom/digdroid/alman/dig/r2$o$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/r2$o$a;-><init>(Lcom/digdroid/alman/dig/r2$o;)V

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2, v1}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$s;)V

    return-void
.end method
