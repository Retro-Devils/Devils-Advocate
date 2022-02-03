.class public Lcom/digdroid/alman/dig/SDCardBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    new-instance v0, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;-><init>(Lcom/digdroid/alman/dig/SDCardBroadcastReceiver;Landroid/content/Context;Landroid/content/Intent;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Void;

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
