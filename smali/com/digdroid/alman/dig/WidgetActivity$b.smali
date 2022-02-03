.class Lcom/digdroid/alman/dig/WidgetActivity$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/WidgetActivity;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/Callable;

.field final synthetic b:Lcom/digdroid/alman/dig/WidgetActivity;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/WidgetActivity;Ljava/util/concurrent/Callable;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/WidgetActivity$b;->b:Lcom/digdroid/alman/dig/WidgetActivity;

    iput-object p2, p0, Lcom/digdroid/alman/dig/WidgetActivity$b;->a:Ljava/util/concurrent/Callable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/WidgetActivity$b;->b:Lcom/digdroid/alman/dig/WidgetActivity;

    new-instance v2, Lcom/digdroid/alman/dig/WidgetActivity$b$a;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/WidgetActivity$b$a;-><init>(Lcom/digdroid/alman/dig/WidgetActivity$b;)V

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v3, v2}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$s;)V

    return-void
.end method
