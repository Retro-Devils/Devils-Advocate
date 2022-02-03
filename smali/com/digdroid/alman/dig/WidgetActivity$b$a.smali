.class Lcom/digdroid/alman/dig/WidgetActivity$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/WidgetActivity$b;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/WidgetActivity$b;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/WidgetActivity$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/WidgetActivity$b$a;->a:Lcom/digdroid/alman/dig/WidgetActivity$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    new-instance v0, Lcom/digdroid/alman/dig/t$a;

    iget-object v1, p0, Lcom/digdroid/alman/dig/WidgetActivity$b$a;->a:Lcom/digdroid/alman/dig/WidgetActivity$b;

    iget-object v2, v1, Lcom/digdroid/alman/dig/WidgetActivity$b;->b:Lcom/digdroid/alman/dig/WidgetActivity;

    iget-object v1, v1, Lcom/digdroid/alman/dig/WidgetActivity$b;->a:Ljava/util/concurrent/Callable;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/digdroid/alman/dig/t$a;-><init>(Lcom/digdroid/alman/dig/t;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Callable;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/WidgetActivity$b$a;->a:Lcom/digdroid/alman/dig/WidgetActivity$b;

    iget-object v0, v0, Lcom/digdroid/alman/dig/WidgetActivity$b;->b:Lcom/digdroid/alman/dig/WidgetActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
